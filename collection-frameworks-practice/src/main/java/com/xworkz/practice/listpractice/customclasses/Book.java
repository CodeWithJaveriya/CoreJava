package com.xworkz.practice.listpractice.customclasses;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@AllArgsConstructor
public class Book {

    private int id;
    private String name;
    private String author;


}
