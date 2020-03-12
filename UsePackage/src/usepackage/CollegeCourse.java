
package usepackage;

/**
 *
 * @author maconrm180
 */
public class CollegeCourse {
    String departments = "";
    int courseNum = 0;
    int credits = 0;
    int fees = 120;
    
    public CollegeCourse (String departments, int courseNum, int credits) {
        this.departments = departments;
        this.courseNum = courseNum;
        this.credits = credits;
        this.fees = 120 * credits;
    }
    
    public void display(){
        System.out.println(departments);
        System.out.println(courseNum);
        System.out.println(credits);
        System.out.println(fees);
    }
   
     
     
     
     
     
    }