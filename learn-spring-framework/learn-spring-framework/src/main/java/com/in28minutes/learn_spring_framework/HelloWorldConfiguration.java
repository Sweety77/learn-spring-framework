package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//introduced in JDK 16 - Eliminating verbosity while creating Java Beans.
//“Verbosity refers to the amount of boilerplate code required to define a Java Bean.
/*
Java 16 records significantly reduce verbosity by automatically generating constructors, accessors, and common methods
    like equals, hashCode, and toString.”
    we can have custom methods in records as well
 */
record Person (String name, int age ){}
record Address(String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Sweety";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 25);
    }

    @Bean(name = "address2")// give different name to the bean which generally be the actual name of the method, use name attribute.
    public Address address(){
        return new Address("10th Ave SW", "Calgary");
    }
}
