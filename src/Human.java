package org.example;
public class Human {
    private int age;
    private double height;
    private double weight;
    public Human( int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

}
