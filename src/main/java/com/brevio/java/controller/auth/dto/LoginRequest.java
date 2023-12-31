package com.brevio.java.controller.auth.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LoginRequest {

    private String email;
    private String password;
}
