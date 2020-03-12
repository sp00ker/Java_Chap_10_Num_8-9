
package usepackage;


public class LabCourse extends CollegeCourse {
    
    public LabCourse(String departments, int courseNum, int credits) {
        super(departments, courseNum, credits);
    }
    @Override
        public void display(){
            System.out.println("This is a lab course");
            System.out.println(departments);
            System.out.println(courseNum);
            System.out.println(credits);
            System.out.println(fees);
        }
}
