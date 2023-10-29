package com.recruitment.config.exception;

import com.recruitment.config.exception.response.ErrorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Objects;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class HandlerExceptionController {

    private static final String RESULT_NG = "ng";

    @ExceptionHandler({BusinessException.class})
    public ResponseEntity<ErrorResponse> handleBusinessException(BusinessException exception) {

        log.info(exception.getMessage(), Objects.isNull(exception.getCause()) ? exception : exception.getCause());

        return ResponseEntity.status(exception.getStatus())
                .body(ErrorResponse.builder()
                        .result(RESULT_NG)
                        .errorMessages(Collections.singletonList(exception.getMessage()))
                        .build());
    }
}
