package com.EventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;


public class CollegeStartEventHander implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("College is ended : End Event");

    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}
