package com.planning.model;


public class UnderWeightPerson extends Person{

    public UnderWeightPerson(String name, int age, double weight,double height, double physicalFrequency){
        super(name, age, weight ,height, physicalFrequency);
    }
    
    @Override
    public String getClassification(){
        return "Under Weight";
    }
    
    @Override
    public void planning(){
        System.out.println("Hi, based on your BMI, your condition physical is under weight!");
        System.out.println("The plan is to have a clean diet with high caloric intake and Attend the gym at least 4 times a week.");
    }

    @Override
    public String getPlanning() {
    return "Seu plano personalizado...";
    }

}