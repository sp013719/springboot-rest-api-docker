package com.restapi.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Getter
@Service
public class AppIdService {

    private final String appId;

    public AppIdService() {
        this.appId = UUID.randomUUID().toString();
    }
}
