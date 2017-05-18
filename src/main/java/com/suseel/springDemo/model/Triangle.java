package com.suseel.springDemo.model;


import org.springframework.stereotype.Component;

@Component
public class Triangle {

   private Point pointA;
   private Point pointB;
   private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Triangle is drawn with first point x="+ pointA.getX() + "and y =" + pointA.getY()
        + "\n second point x = " + pointB.getX() + "y = " + pointB.getY()
        + "third point  x = " + pointC.getX() + "y = " + pointC.getY());
    }
}
