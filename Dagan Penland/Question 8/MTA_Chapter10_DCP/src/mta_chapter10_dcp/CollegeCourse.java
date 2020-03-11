package mta_chapter10_dcp;

import javax.swing.JOptionPane;

public class CollegeCourse {
    
    String dept = "";
    int course_number = 0;
    int credit= 0;   
    int fee;
    
    public CollegeCourse(String dept, int course_number, int credit )
    {
    
    this.dept = dept;
    this.course_number = course_number;
    this.credit = credit;
    fee = credit*120;
    }
    
    
    
    //display method
    public void display()
    {
   
   JOptionPane.showMessageDialog(null, dept +" "+ course_number + 
  "\nNon-lab Course" + "\n" + credit +" Credits" + "\nTotal fee is $" + fee);
    }
    
    
}
