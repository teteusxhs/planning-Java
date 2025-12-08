package com.planning.model;


public class OverWeightPerson extends Person{
    public OverWeightPerson(String name, int age, double weight,double height, double physicalFrequency){
        super(name, age, weight ,height, physicalFrequency);
    }
    
    @Override
    public String getClassification(){
        return "Over Weight";
    }

     @Override
     public void planning(){
        System.out.println("Hi, based on your BMI, your condition physical is over weight ");
        System.out.println("The plan is to have a clean diet with low calorie intake and Attend the gym at least 4 times a week.");
        System.out.println("Be careful not to progress to obesity!");
     }
     
    @Override
    public String getPlanning() {
    return "Seu plano personalizado...";
    }   

}