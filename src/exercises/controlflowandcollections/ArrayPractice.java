package exercises.controlflowandcollections;

import java.util.*;
import java.lang.*;
import java.util.Collections;

public class ArrayPractice {
    public static void main(String[] args) {

        Integer[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.println("\n" + integerArray[i]);
            }
        }

        String wouldNotPhrase = "Where I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseSplit = wouldNotPhrase.split(" ");
        System.out.println("\n" + Arrays.toString(phraseSplit));

        Integer[] listOfNumbers = {1,2,3,4,5,6,7,8,9};
        findEven(listOfNumbers);

        find5CharWords(phraseSplit);

        studendIDs();

    }

    public static void findEven(Integer[] integerList) {

        for (int i = 0; i < integerList.length; i++) {
            if (integerList[i] % 2 == 0) {
                System.out.println(integerList[i]);
            }
        }
    }

    public static void find5CharWords(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].length() == 5) {
                System.out.println(wordList[i]);
            }
        }
    }
    public static void studendIDs() {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number: ");
                Integer newGrade = input.nextInt();
                students.put(newGrade, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while (!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());

        }



    }
}
