package com.acme.service.consumer;

import com.acme.service.api.Service;
import javax.inject.Inject;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.environment.se.Weld;

public class ServiceConsumer {

    @Inject
    private Service service;

    public void run() {
        System.out.println(this.service.greet());
    }

    public static void main(String[] argv) {
        try (WeldContainer weld = new Weld().initialize()) {
            weld.select(ServiceConsumer.class).get().run();
        }
    }
}
