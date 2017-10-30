package com.kravchenko;

import com.kravchenko.repository.BlogRepository;
import com.kravchenko.repository.BlogRepositoryImpl;
import com.kravchenko.service.BlogService;
import com.kravchenko.service.BlogServiceImpl;
import com.kravchenko.service.ValidationService;
import com.kravchenko.service.ValidationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DbConfiguration.class)
public class MainConfiguration {
    @Bean
    public ValidationService validationService() {
        return new ValidationServiceImpl(userService());
    }

    @Bean
    public BlogService userService() {
        return new BlogServiceImpl();
    }

    @Bean
    public BlogRepository blogRepository(){
        return new BlogRepositoryImpl();
    }
}
