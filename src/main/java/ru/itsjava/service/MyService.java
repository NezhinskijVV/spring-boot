package ru.itsjava.service;

import javax.annotation.PostConstruct;

public class MyService {

    @PostConstruct
    public void init(){
        System.out.println("My Service");
    }
}
