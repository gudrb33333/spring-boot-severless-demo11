package com.example.demo11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String surname;
    private String emailAddress;

    //standard constructor, getters and setters
}

