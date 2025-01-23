/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
//testing class
public class BackToSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);
        
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);

    /* Run Output
        Coach Bob, age: 27, gender: M
        Lynne Brooke, age: 16, gender: F, student id: HS95129, gpa: 3.5
        Duke Java, age: 34, gender: M, subject: Computer Science, salary: 50000.0
        Ima Frosh, age: 18, gender: F, student id: UCB123, gpa: 4.0, year 1, major: English
    */
    
    }

}
