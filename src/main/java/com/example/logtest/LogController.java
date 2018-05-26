package com.example.logtest;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    final static Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/")
    public String hello() {
        logger.trace("hello, {}", "/trace");
        logger.debug("hello, {}", "/debug");
        logger.info("hello, {}", "/info");
        logger.warn("hello, {}", "/warn");
        logger.error("hello, {}", "/error");

        return "hello";
    }
}

