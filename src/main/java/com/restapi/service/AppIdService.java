package com.restapi.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AppIdService {

    private final String appId;

    public AppIdService() {
        this.appId = UUID.randomUUID().toString();
    }

    public String getAppId() {
        return appId;
    }
}
