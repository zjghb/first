package com.example.demojava;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {
        System.out.println("helloworld");
        new ThreadPoolExecutor(1, 5, 10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5));
    }
}
