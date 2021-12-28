package exercises.classesinjavapart1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student theSparkman = new Student();
            theSparkman.setStudentName("Melvin");
            theSparkman.setStudentID(10001);
            theSparkman.setNumberOfCredits(1);
            theSparkman.setGpa(4.0);

        SchoolCourses courseLineUp = new SchoolCourses();
            courseLineUp.setStudentName("Harold", "Deobfuscating Convoluted Instruction");
            courseLineUp.setStudentName("Melvin", "Deobfuscating Convoluted Instruction");
            courseLineUp.setStudentName("BlueNotes", "Deobfuscating Convoluted Instruction");
            courseLineUp.setStudentName("Teddy", "Anatomy of Straight-forward Communication");
            courseLineUp.setStudentName("Pendergrast", "Anatomy of Straight-forward Communication");
            courseLineUp.setStudentName("BlueNotes", "Anatomy of Straight-forward Communication");

            System.out.println("\n");

            courseLineUp.getCourseByStudent("Melvin");
            courseLineUp.getCourseByStudent("Teddy");

            SchoolCourses courses = new SchoolCourses();
            courses.setCourseByID(79001, "Deobfuscating Convoluted Instruction");
            courses.setCourseByID(79002, "Anatomy of Straight-forward Communication");
            courses.setCourseByID(79003, "Ambiguous and the Abstract");

            SchoolCourses courseIdByStudent = new SchoolCourses();
            SchoolCourses.courseIdByStudent.put(79001, "Harold");
            SchoolCourses.courseIdByStudent.put(79002, "Melvin");
            SchoolCourses.courseIdByStudent.put(79003, "BlueNote");

            System.out.println("\n");

            courses.getCourseByID(79001);
            courses.getCourseByID(79002);

            TheDatabases.courseByTeacher.put(79001, "Harris, Gene");
            TheDatabases.courseByTeacher.put(79002, "Nelson, William");
            TheDatabases.courseByTeacher.put(79003, "Oconnor, Sinead");

            System.out.println("\n");

            Teacher.getTeacherByLastName(79001);
            Teacher.getTeacherByLastName(79002);
            Teacher.getTeacherByLastName(79003);


    }
}
