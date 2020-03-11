/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticemta;

/**
 *
 * @author MaconRM180
 */
public class LabCourse extends CollegeCourse {
    public LabCourse(String department, int courseNum, int credits) {
        super(department, courseNum, credits);
        
        fee=credits*120;
        fee+= 50;
    }
    
    @Override
    public void display(){
        System.out.println("This is a lab course");
        System.out.println(department);
        System.out.println(courseNum);
        System.out.println(credits);
        System.out.println(fee);

    }
    
    
}
