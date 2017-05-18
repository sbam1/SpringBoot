package com.suseel.springDemo.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class drawEvent extends ApplicationEvent {
    public drawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString(){
        return "draw event occured";
    }
}
