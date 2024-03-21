package com.example.onlinemarket.services;


import com.example.onlinemarket.dto.mail.EmailDto;
import com.example.onlinemarket.exception.IncorrectPassword;
import com.example.onlinemarket.exception.TimeOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class EmailService {
    @Value("${spring.mail.username}")
    private String sender;
    private final JavaMailSender javaMailSender;

    public void sendVerifyCode(String email,String code) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(sender);
            message.setTo(email);
            message.setSubject("Verify code");
            message.setText(code);
            javaMailSender.send(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
