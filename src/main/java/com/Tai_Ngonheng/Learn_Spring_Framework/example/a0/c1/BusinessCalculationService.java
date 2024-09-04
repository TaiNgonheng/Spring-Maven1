package com.Tai_Ngonheng.Learn_Spring_Framework.example.a0.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
public class BusinessCalculationService {
    private DataService dataService;
    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService= dataService;
    }

    public int findMax(){

        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
