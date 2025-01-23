/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
public class Person {

    private String myName; // name of the person
    private int myAge; // person's age
    private String myGender; // "M" for male, "F" for female
    
// constructor
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

//Methods
    public String getName(){
        return myName;
    }
    
    public int getAge(){
        return myAge;
    }
    
    public String getGender(){
        return myGender;
    }
    
    public void setName(String name){
        myName = name;
    }
    
    public void setAge(int age){
        myAge = age;
    }
    
    public void setGender(String gender){
        myGender = gender;
    }
    
//toString method
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }

}
