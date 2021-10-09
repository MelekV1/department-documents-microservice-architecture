package com.mcode.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/documentServiceFallBack")
    public String documentServiceFallBackMethod(){
        return "Document Service is taking longer than Expected."+
                "Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "Department Service is taking longer than Expected."+
                "Please try again later";
    }

}
