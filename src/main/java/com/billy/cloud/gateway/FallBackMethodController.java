package com.billy.cloud.gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethood(){
        return "User service is taking longer than Expected." + "Please try agian later";
    }

    @GetMapping("/departmetServiceFallBackMethod")
    public String departmentServiceFallBackMethood(){
        return "Department service is taking longer than Expected." + "Please try agian later";
    }
}
