//git config --global user.name 'meta'
//git config --global user.email 'meta@gmail.com'

package com.meta.data;

public class Pet {
    protected String id;
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String id, String name, int yob, double weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void showInfor(){
        System.out.println(this.name + " has: " + this.weight);
    }
}
