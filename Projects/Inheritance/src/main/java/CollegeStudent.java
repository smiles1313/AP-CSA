/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
class CollegeStudent extends Student {
    
    String myMajor;
    int myYear;
    
//constructor
    public CollegeStudent(String name, int age, String  gender, String idNum, double gpa, int year, String major){
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }
    
//Methods
    public int getYear(){
        return myYear;
    }
        
    public String getMajor(){
        return myMajor;
    }
    
    public void setYear(int year){
        myYear = year;
    }
    
    public void setMajor(String major){
        myMajor = major;
    }
    
//toString Method
    @Override
    public String toString(){
        return super.toString() + ", year " + myYear + ", major: " + myMajor;
    }
}
