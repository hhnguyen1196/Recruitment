package com.recruitment.util;

import org.springframework.http.ResponseEntity;

public class ResponseDataConfiguration {

    public static <T> ResponseEntity<T> success(T body) {
        return ResponseEntity.ok(body);
    }
}
