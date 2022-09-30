package com.demo.naumov.dao.response;

import com.demo.naumov.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpResponse {
    private User user;
}
