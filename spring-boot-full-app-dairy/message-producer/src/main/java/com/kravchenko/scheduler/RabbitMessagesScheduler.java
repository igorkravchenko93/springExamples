package com.kravchenko.scheduler;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.stream.IntStream;

import static com.kravchenko.rabbit.RabbitConfigs.TOPIC_EXCHANGE_NAME;

@Service
@AllArgsConstructor
@Slf4j
public class RabbitMessagesScheduler {

    private final RabbitTemplate rabbitTemplate;

    @Scheduled(fixedRate = 100)
    public void sendMessageToRabbitMq() {
        IntStream.range(0, 5000).forEach(i -> {
                    String message = String.join(" ", Instant.now().toString(), RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5));
                    rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "foo.bar.baz", message);
                }
        );
//        log.info("message sent to rabbit: {}", message);
    }
}
