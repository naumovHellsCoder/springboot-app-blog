package com.demo.naumov.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtils {
    private Long jwtExpirationMs = 868000L;
    private String jwtSecret = "jwt-secret";

    private String generationToken(String username){
        return Jwts.builder().setExpiration(new Date())
                .setIssuedAt(new Date(new Date().getTime() + jwtExpirationMs))
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }
}
