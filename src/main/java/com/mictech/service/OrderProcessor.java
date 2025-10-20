package com.mictech.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderProcessor {

    public void processOrder() {
        // Example of using the logger
        log.info("Processing a new order...");
    }
}
