/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usepackage;

import javax.swing.JOptionPane;

/**
 *
 * @author maconrm180
 */
public class UsePackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CollegeCourse college;
         
         String dept = JOptionPane.showInputDialog(null, "Enter Department");
         
         String courseNum5 = JOptionPane.showInputDialog(null, "Enter Course Number");
         int courseNum = Integer.parseInt(courseNum5);
         
         String credString = JOptionPane.showInputDialog(null, "Enter Credits");
         int cred = Integer.parseInt (credString);
         
         if(dept.equals("BIO")|| dept.equals("CHM") || dept.equals("CIS") || dept.equals("PHY")) {
             college = new LabCourse (dept, courseNum, cred);
         }else{
             college = new CollegeCourse (dept, courseNum, cred);
         }
      college.display();
        
           
       }
    }
    

