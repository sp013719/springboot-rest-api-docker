package com.restapi;

import com.restapi.service.AppIdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appId")
public class AppIdController {
    private final AppIdService appIdService;

    public AppIdController(AppIdService appIdService) {
        this.appIdService = appIdService;
    }

    @GetMapping
    public String getCustomer(){
        return this.appIdService.getAppId();
    }

}
