package com.recruitment.config.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ErrorResponse {

  @JsonProperty("errorMessages")
  private final List<String> errorMessages;

}
