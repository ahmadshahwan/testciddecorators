package com.acme.service.provider;

import com.acme.service.api.Service;
import javax.inject.Singleton;

@Singleton
public class ServiceImpl implements Service {

    public String greet() {
        return "Hello";
    }
}
