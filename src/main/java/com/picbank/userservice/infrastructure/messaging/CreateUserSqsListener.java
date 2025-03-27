package com.picbank.userservice.infrastructure.messaging;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.picbank.userservice.application.port.in.CreateUserUseCase;
import com.picbank.userservice.domain.model.User;
import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateUserSqsListener {

    private final CreateUserUseCase createUserUseCase;
    private final ObjectMapper objectMapper;

    @SqsListener("${aws.sqs.queue-url}")
    public void listenUserCreation(String message) {
        try {
            log.info("Received message from SQS: {}", message);

            User user = objectMapper.readValue(message, User.class);

            createUserUseCase.createUser(user);

            log.info("User successfully processed and saved: {}", user.getEmail());

        } catch (Exception e) {
            log.error("Error processing SQS message: {}", e.getMessage(), e);
        }
    }
}
