package com.acme.service.consumer;

import com.acme.service.api.Service;
import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class ServiceDecorator implements Service {

    @Delegate
    @Inject
    private Service delegate;

    public String greet() {
        return delegate.greet().concat(" World");
    }
}
