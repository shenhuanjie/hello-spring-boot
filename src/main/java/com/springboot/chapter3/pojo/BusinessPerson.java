package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {
    @Autowired
    private Animal animal = null;


    @Override
    public void service() {
        this.animal.user();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
