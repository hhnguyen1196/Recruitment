package com.recruitment.util;

import com.recruitment.config.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseDataConfiguration {

  public static <T> ResponseEntity<T> success(T body) {
    return ResponseEntity.ok(body);
  }
}
