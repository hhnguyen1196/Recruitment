package com.recruitment.api.opening_schedule.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpeningScheduleGetApiResponse {

    @JsonProperty("courseId")
    public Long courseId;

    @JsonProperty("name")
    public String name;

    @JsonProperty("code")
    public String code;

    @JsonProperty("description")
    public String description;

    @JsonProperty("createdBy")
    public String createdBy;

    @JsonProperty("createdAt")
    public LocalDateTime createdAt;

    @JsonProperty("updatedBy")
    public String updatedBy;

    @JsonProperty("updatedAt")
    public LocalDateTime updatedAt;

}
