package com.recruitment.config.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class BusinessException extends RuntimeException {

  private HttpStatus status;

  public BusinessException(HttpStatus status) {
    this.status = Objects.nonNull(status) ? status : HttpStatus.INTERNAL_SERVER_ERROR;
  }

  public BusinessException(String message) {
    super(message);
  }

  public BusinessException(HttpStatus status, String message) {
    super(message);
    this.status = Objects.nonNull(status) ? status : HttpStatus.INTERNAL_SERVER_ERROR;
  }
}
