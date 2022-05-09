package com.kaviddiss.streamkafka;

import com.kaviddiss.streamkafka.config.LoggingChannelInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StreamKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
    @Bean
    public LoggingChannelInterceptor loggingChannelInterceptor()
    {
        return new LoggingChannelInterceptor();
    }
}
