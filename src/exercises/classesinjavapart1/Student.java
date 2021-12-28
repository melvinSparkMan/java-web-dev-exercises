package exercises.classesinjavapart1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String studentName;
    private String courseName;
    private int courseId;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

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
}