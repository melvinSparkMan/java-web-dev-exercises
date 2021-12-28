package exercises.classesinjavapart1;

public class Teacher {

    public static String teacherLastName;
    public static String teacherFistName;
    public static String teacherSubject;
    public static int    yearsTeaching;

    public static void getTeacherByLastName(int aCourseId) {
        SchoolCourses.courseId = aCourseId;
        System.out.println("Course ID: " + SchoolCourses.courseId + "  " + "Course Name: " + SchoolCourses.courses.get(SchoolCourses.courseId) + "  Teacher: " + TheDatabases.courseByTeacher.get(aCourseId) + "   Student: " + SchoolCourses.courseIdByStudent.get(aCourseId));
        return;
    }


}
