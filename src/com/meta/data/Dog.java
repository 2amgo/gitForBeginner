package com.meta.data;

public class Dog extends  Pet{

    public Dog(String id, String name, int yob, double weight) {
        super(id, name, yob, weight);
    }
    public void showWeight(){
        System.out.println(this.weight);
        System.out.println("this is change" );
        System.out.println("this is  another change" );
    }
}
