package com.kravchenko.controller;

import com.kravchenko.controller.dto.InputMessageDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.kravchenko.rabbit.RabbitConfigs.TOPIC_EXCHANGE_NAME;

@RestController
@RequestMapping("/message")
@AllArgsConstructor
@Slf4j
public class MessageController {

    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/create")
    public ResponseEntity<String> generateMessage(@RequestBody InputMessageDto dto) {
        String message = String.join(" ", dto.getText(), RandomStringUtils.random(10));
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "foo.bar.baz", message);
        log.info("message sent to rabbit: {}", message);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}
