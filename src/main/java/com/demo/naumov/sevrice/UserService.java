package com.demo.naumov.sevrice;

import com.demo.naumov.dao.request.SignUpRequest;
import com.demo.naumov.dao.response.SignUpResponse;
import com.demo.naumov.model.ERole;
import com.demo.naumov.model.User;
import com.demo.naumov.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public ResponseEntity<SignUpResponse> registrationUser(SignUpRequest signUpRequest){
        User user= new User();
        user.setUsername(signUpRequest.getUsername());
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        user.setCreateAt(LocalDate.now());
        user.setRole(ERole.USER);
        userRepository.save(user);
        return ResponseEntity.ok()
                .body(new SignUpResponse(user));
    }
    public User getUser(Integer id){
        User user = userRepository.findById(id).orElseThrow(()->{
            return null;
        });
        return user;

    }
}
