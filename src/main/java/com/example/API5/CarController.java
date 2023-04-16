package com.example.API5;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    CarDTO carDTO1;

    @GetMapping("/auto")
    public String getCar(){
        return carDTO1.toString();
    }

    @PostMapping("/auto")
    public String postCar(@RequestBody @Valid CarDTO carDTO2){
        String s = "Creazione di un'auto nuova: ";
        return s + carDTO2.toString();
    }

}

