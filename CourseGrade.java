
/**
 * A class encapsulating the concept of a course grade
 * 
 * @author Jeremie Guerchon
 */

public class CourseGrade {
 String course;
 char grade; 
    
    public CourseGrade(String newCourse, char newGrade) {
        this.course = newCourse;
        this.grade = newGrade;
    }
    
    public String toString() {
        String grading = "\nCourse name: " + this.course;
        grading += "\nGrade received: " + this.grade;
        
        return grading;
    }
        public boolean equals(CourseGrade cg1)  {
            if (this.course == cg1.course && this.grade == cg1.grade)  {
                return true;
            } else {
                return false;
            }
                
        }
    
        public static void main(String[] args) {
            
            CourseGrade cg1 = new CourseGrade("English",'A');
    
            System.out.println(cg1);
        }
}