/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mta_chapter10_dcp;
import javax.swing.JOptionPane;

public class LabCourses extends CollegeCourse {

    public LabCourses(String dept, int course_number, int credit) {
        super(dept, course_number, credit);
   
   fee = credit*120; 
   fee +=50;
    }
     
   
    @Override
    public void display(){
   
    
     JOptionPane.showMessageDialog(null, dept +" "+ course_number + 
  "\nLab Course" + "\n" + credit +" Credits" + "\nTotal fee is $" + fee);
    }
    
}
