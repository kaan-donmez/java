package com.example.locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private LanguageResolver languageResolver;

    @GetMapping
    public String greeting(HttpServletRequest request) {
        return messageSource.getMessage("greeting", null, languageResolver.resolveLocale(request));
    }

}
