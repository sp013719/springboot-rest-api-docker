package com.restapi.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private String id;
    private String name;
    private String email;
}
