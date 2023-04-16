package com.example.API5;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Data
@Component
public class CarDTO {
    @NotBlank
    public String id;
    @NotBlank
    public String modelName;
    public double price;
}
