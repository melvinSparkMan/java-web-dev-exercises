package exercises.classesinjavapart1;


import java.util.HashMap;

public class TheDatabases {

    public static HashMap<String, Integer> teacherByCourse = new HashMap<>();
    public static HashMap<Integer, String> courseByTeacher = new HashMap<>();
    HashMap<String, String> teacherByStudent = new HashMap<>();
    HashMap<String, String> studentByTeacher = new HashMap<>();
    HashMap<String, Integer> teacherByYears = new HashMap<>();
    HashMap<Integer, String> yearsByTeacher = new HashMap<>();


    public void getTeacherByCourse(int aCourseId) {
        System.out.println("Course ID: " + aCourseId + "  " + "Teacher Name: " + courseByTeacher.get(aCourseId));
        return;
    }

    public void setCourseByTeacher(int aCourseId, String aTeacherName) {
        SchoolCourses.courseId = aCourseId;
        Teacher.teacherLastName = aTeacherName;
        courseByTeacher.put(SchoolCourses.courseId, Teacher.teacherLastName);
        teacherByCourse.put(Teacher.teacherLastName, SchoolCourses.courseId);
    }
}
