package com.example;

import com.example.greeting.Greeting;

public class Hello {
    public static void main(String args[]) {
	if (args.length > 0) {
	    Greeting.sayHello(args[0]);
	} else {
            Greeting.sayHello("World");
	}
    }
}
