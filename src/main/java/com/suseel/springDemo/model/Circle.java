package com.suseel.springDemo.model;

import com.suseel.springDemo.event.drawEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by EvaBam on 5/17/2017.
 */
@Component(value = "circle")
public class Circle implements ApplicationEventPublisherAware{

    @Autowired
    private Point point;

    private ApplicationEventPublisher publisher;

    private drawEvent event;

    public Point getCenter() {
        return point;
    }


    public void setCenter(Point center) {
        this.point = center;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public ApplicationEventPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public drawEvent getEvent() {
        return event;
    }

    public void setEvent(drawEvent event) {
        this.event = event;
    }

    public void draw(){
        System.out.println("this is a circle");
        event = new drawEvent(this);
        publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }
}
