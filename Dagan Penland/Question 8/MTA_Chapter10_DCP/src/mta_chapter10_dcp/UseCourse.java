package mta_chapter10_dcp;

import javax.swing.JOptionPane;

public class UseCourse
{   
    public UseCourse()
    {
        CollegeCourse college;
         String dept = JOptionPane.showInputDialog(null, "Enter Department");

        String courseNumString = JOptionPane.showInputDialog(null, "Enter Course Number");
        int courseNum = Integer.parseInt(courseNumString);

        String credString = JOptionPane.showInputDialog(null, "Enter Credits");
        int cred = Integer.parseInt(credString);

         if (dept.equals("BIO") | dept.equals("CHM") | dept.equals("CIS") | dept.equals("PHY"))
        {college = new LabCourses(dept, courseNum, cred);}

        else {college = new CollegeCourse(dept, courseNum, cred);}
        college.display();
    }

    public static void main(String[] args) 
    {new UseCourse();}
}