package com.example.demo.Exeption;

public class ResourceNotFoundException extends RuntimeException {
   public ResourceNotFoundException(String e) {
        System.out.println(e);
   }
}
