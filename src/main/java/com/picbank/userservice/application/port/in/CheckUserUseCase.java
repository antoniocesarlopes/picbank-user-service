package com.picbank.userservice.application.port.in;

public interface CheckUserUseCase {
    boolean checkUserExists(String email);
}

