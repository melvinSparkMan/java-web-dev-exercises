package exercises.classesinjavapart1;

import java.util.HashMap;

public class SchoolCourses {
    public static String courseName;
    public static String studentName;

    public static int courseId;
    private static int numberOfCredits;

    public static HashMap<String, String> studentsByCourses = new HashMap<>();
    public static HashMap<Integer, String> courses = new HashMap<>();
    public static HashMap<String, Integer> courseByCredits = new HashMap<>();
    public static HashMap<Integer, String> courseIdByStudent = new HashMap<>();

    public void getCourseByStudent(String studentName) {

        System.out.println("Student: " + studentName + "  Course: " + (studentsByCourses.get(studentName)) );
        return;
    }

    public void setStudentName(String aStudentName, String aCourseName) {
        courseName = aCourseName;
        studentName = aStudentName;
        studentsByCourses.put(studentName,courseName);
    }

    public void getCourseByID(int aCourseId) {
        System.out.println("Course ID: " + aCourseId + "  " + "Course Name: " + courses.get(aCourseId));
        return;
    }

    public void setCourseByID(int aCourseId, String aCourseName) {
        courseId = aCourseId;
        courseName = aCourseName;
        courses.put(courseId, courseName);
    }

}
