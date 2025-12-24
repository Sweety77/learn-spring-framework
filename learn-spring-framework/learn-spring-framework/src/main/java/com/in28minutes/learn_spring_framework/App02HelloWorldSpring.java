package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1.  Launch Spring application/Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2. Configure the things we want spring to manage
        // create HelloWorldConfiguration annotated with @Configuration
        // a method annotated with @Bean on it which returns some value based on method type

        //Retrieve beans managed by Spring
        System.out.println("name - " +context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
//        System.out.println(context.getBean("address"));
//        Once spring has beans - can fetch it using bean name or class name
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person3Parameters"));
    }
}
