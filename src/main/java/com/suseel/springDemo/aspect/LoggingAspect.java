package com.suseel.springDemo.aspect;

import com.suseel.springDemo.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Before("allMethodesOfCircle()")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("-------->" + joinPoint.toString() + joinPoint.getTarget());
        Circle circle = (Circle) joinPoint.getTarget();
        System.out.println(circle.getCenter().getX());
    }

    @Pointcut("execution(public void com.suseel.springDemo.model.Circle.draw())")
    public void allGetters(){

    }

    @Before("args(name)")
    public void loggingAdviceForArg(String name){
        System.out.println(name);

    }

    @Pointcut("within(com.suseel.springDemo.model.Circle)")
    public void allMethodesOfCircle(){

    }
}
