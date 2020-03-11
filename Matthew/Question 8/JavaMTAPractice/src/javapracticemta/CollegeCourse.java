
package javapracticemta;

public class CollegeCourse {
    
    String department = "";
    int courseNum = 0;
    int credits = 0;
    int fee = 120;
    
        public CollegeCourse(String department,int courseNum,int credits){
         this.department = department;
         this.courseNum = courseNum;
         this.credits = credits;
         this.fee = 120*credits;
        }
        
        public void display(){
            System.out.println(department);
            System.out.println(courseNum);
            System.out.println(credits);
            System.out.println(fee);

        }
    
    
}
