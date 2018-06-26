package com.mycompany.app;

/**
 * Hello world2!
 */
public class App
{

    private final String message = "Hello World2!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
