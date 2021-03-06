package grades;

import java.util.ArrayList;
/*should have private properties for the student's name, and grades. The grades
property should be an ArrayList of integers. The student class should have a
constructor that sets name property, and initializes the grades property as an
empty ArrayList.*/

/*Test your Student class by adding a main method and creating Student objects.
Verify that you can add grades to each object, and that your getGradeAverage
method correctly returns the average of the student's grades.*/


public class Student {
    private Student name;
    private Student grades;



    //    int avg = studentGrades / studentGrades.size();
    static private ArrayList<String> studentNames = new ArrayList<>();
    static private ArrayList<Integer> studentGrades = new ArrayList<>();

    //set Student's name
    public void setName(Student name) {
        this.name = name;
    }

    //set Student's grades
    public void setGrades(Student grades) {
        this.grades = grades;
    }

    //returns the student's grades
    public Student getGrades() {
        return grades;
    }

    // returns the student's name
    public Student getName() {
        return name;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    // returns the average of the students grades
    public int getGradeAverage(int studentGrades) {
        //initialized a total and average for loop to add all student grades together
        int total = 0;

       /* for(int i=0; i<studentGrades.length; i++){
//            total = total + studentGrades[i];
            total = Integer.sum(studentGrades[i]);
        }
        double average = total / studentGrades.length; */
        return total;
    }



    public static void main(String[] Args) {

    }
}
