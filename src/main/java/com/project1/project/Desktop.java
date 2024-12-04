package com.project1.project;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile()
    {
        System.out.println("compiling..desktop..");
    }
}
