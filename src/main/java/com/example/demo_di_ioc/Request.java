package com.example.demo_di_ioc;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Schema(required = true,description = "Name cua sinh vien")
    @NotEmpty(message = "nam not null")// null hoặc empty
    private String name;
    private int score;


}
