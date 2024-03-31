package com.inviv.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inviv.test.entity.AppLog;
import com.inviv.test.repository.AppLogRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
@Slf4j
public class WebhookController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AppLogRepository appLogRepository;

    @GetMapping("")
    ResponseEntity<AppLog> handleMessage() {

        return ResponseEntity.ok(appLogRepository.findById(1000L).orElse(new AppLog()));
    }
}
