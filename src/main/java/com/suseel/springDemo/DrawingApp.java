package com.suseel.springDemo;


import com.suseel.springDemo.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        System.out.println("hello world");
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Circle circle = (Circle)beanFactory.getBean("circle");
        circle.getPoint().setX(12222222);
        circle.draw();
//        System.out.println(circle.getCenter());

    }
}
