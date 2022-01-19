package exercises.classesandobjectspart2;

import exercises.classesinjavapart1.SchoolCourses;
import exercises.classesinjavapart1.Student;
import exercises.classesinjavapart1.Teacher;
import exercises.classesinjavapart1.TheDatabases;

public class SchoolPractice2 {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student theSparkman = new Student();
        theSparkman.setStudentName("Melvin");
        theSparkman.setStudentID(10001);
        theSparkman.setNumberOfCredits(1);
        theSparkman.setGpa(4.0);

        Student2 melvin = new Student2();
        melvin.setStudentName("melvin");
        melvin.setStudentID(10001);

        Student2 rob = new Student2();
        rob.setStudentName("Rob");
        rob.setStudentID(10002);

        Student2 arielle = new Student2();
        arielle.setStudentName("arielle");
        arielle.setStudentID(10003);

        Student2 gus = new Student2();
        gus.setStudentName("gus");
        gus.setStudentID(10004);

        Student2 madison = new Student2();
        madison.setStudentName("madison");
        madison.setStudentID(10005);

        Student2 brando = new Student2();
        brando.setStudentName("brando");
        brando.setStudentID(10006);


        SchoolCourses courseLineUp = new SchoolCourses();
        courseLineUp.setStudentName("melvin", "Deobfuscating Convoluted Instruction");
        courseLineUp.setStudentName("rob", "Deobfuscating Convoluted Instruction");
        courseLineUp.setStudentName("arielle", "Anatomy of Straight-forward Communication");
        courseLineUp.setStudentName("gus", "Anatomy of Straight-forward Communication");
        courseLineUp.setStudentName("madison", "Ambiguous and the Abstract");
        courseLineUp.setStudentName("brando", "Ambiguous and the Abstract");

        System.out.println("\n");

        courseLineUp.getCourseByStudent("melvin");
        courseLineUp.getCourseByStudent("rob");
        courseLineUp.getCourseByStudent("arielle");
        courseLineUp.getCourseByStudent("gus");
        courseLineUp.getCourseByStudent("madison");
        courseLineUp.getCourseByStudent("brando");

        SchoolCourses courses = new SchoolCourses();
        courses.setCourseByID(79001, "Deobfuscating Convoluted Instruction");
        courses.setCourseByID(79002, "Anatomy of Straight-forward Communication");
        courses.setCourseByID(79003, "Ambiguous and the Abstract");

        SchoolCourses.courseIdByStudent.put(79001, "melvin");
        SchoolCourses.courseIdByStudent.put(79001, "rob");
        SchoolCourses.courseIdByStudent.put(79002, "arielle");
        SchoolCourses.courseIdByStudent.put(79002, "gus");
        SchoolCourses.courseIdByStudent.put(79003, "madison");
        SchoolCourses.courseIdByStudent.put(79003, "brando");


        TheDatabases.courseByTeacher.put(79001, "Harris, Gene");
        TheDatabases.courseByTeacher.put(79002, "Nelson, William");
        TheDatabases.courseByTeacher.put(79003, "Oconnor, Sinead");

        System.out.println("\n");

        Teacher.getTeacherByLastName(79001);
        Teacher.getTeacherByLastName(79002);
        Teacher.getTeacherByLastName(79003);


        melvin.addGrade(90, 3.2);
        rob.addGrade(28, 3.2);
        arielle.addGrade(35, 3.2);
        gus.addGrade(61, 3.2);
        madison.addGrade(70, 3.2);
        brando.addGrade(75, 3.2);

        melvin.getGradeLevel();
        rob.getGradeLevel();
        arielle.getGradeLevel();
        gus.getGradeLevel();
        madison.getGradeLevel();
        brando.getGradeLevel();

        System.out.println("\n");

        System.out.println("Student: " + melvin.getStudentName() + " is a " + melvin.gradeLevel);
        System.out.println("Student: " + rob.getStudentName() + " is a " + rob.gradeLevel);
        System.out.println("Student: " + arielle.getStudentName() + " is a " + arielle.gradeLevel);
        System.out.println("Student: " + gus.getStudentName() + " is a " + gus.gradeLevel);
        System.out.println("Student: " + madison.getStudentName() + " is a " + madison.gradeLevel);
        System.out.println("Student: " + brando.getStudentName() + " is a " + brando.gradeLevel);



    }
}

