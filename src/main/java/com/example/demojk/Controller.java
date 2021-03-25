package com.example.demojk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    private String getNewString(JKService jkService) {
//        return "Nhung";
        return jkService.newString();
    }

}
