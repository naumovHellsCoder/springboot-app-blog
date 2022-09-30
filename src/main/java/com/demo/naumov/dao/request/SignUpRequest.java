package com.demo.naumov.dao.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SignUpRequest {
    private String username;
    private String password;

}
