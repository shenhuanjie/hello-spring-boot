package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {
    private Animal animal;

    public BusinessPerson(Animal animal) {
        this.animal = animal;
    }


    @Override
    public void service() {
        this.animal.user();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
