package com.planning.dto;

public class PersonRequest{

    private String name;
    private int age;
    private double height;
    private double weight;
    private int frequency;


    public String getName(){ return name; }
    public void setName(String name){this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public double getHeight(){ return height; }
    public void setHeight(double height){this.height = height;}

    public double getWeight(){ return weight; }
    public void setWeight(double weight){this.weight = weight;}

    public int getFrequency(){ return frequency; }   
    public void setFrequency(int frequency){this.frequency = frequency;}
}
