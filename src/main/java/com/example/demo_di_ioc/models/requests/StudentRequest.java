package com.example.demo_di_ioc.models.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class StudentRequest {
    @Schema(required = true, description = "Id của student")
    @NotEmpty(message = "Id not null")
    private String id;
    @Schema(required = true, description = "Tên học sinh", maximum = "10")
    @NotEmpty(message = "name not null")
    private String name;
    private int score;
}
