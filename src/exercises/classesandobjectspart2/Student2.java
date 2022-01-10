package exercises.classesandobjectspart2;



// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student2 {

    private String studentName;
    private String courseName;
    private int courseId;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private double grade = 0.0;
    public String gradeLevel;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String aStudentName) {
        studentName = aStudentName;
    }



    public void setCourseId(int aCourseID, String aCourseName) {
        courseId = aCourseID;
        courseName = aCourseName;
    }

    public int getStudentID() {
        return studentId;
    }

    public void setStudentID(int aStudentID) {
        studentId = aStudentID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double aGpa) {
        gpa = aGpa;
    }
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        this.numberOfCredits = courseCredits;
        this.gpa = grade;
    }

    public void getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
//        "Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)";
        if (numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (numberOfCredits > 29 && numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (numberOfCredits > 59 && numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else if (numberOfCredits > 89) {
            gradeLevel = "Senior";
        }
    }




}
