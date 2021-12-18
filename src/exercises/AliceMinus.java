package exercises;

import java.util.Scanner;

public class AliceMinus {
    public static void main(String[] args) {
        Scanner input;
        int foundAtIndexOf = 0;
        int searchTermLength = 0;
        int aliceStoryLength = 0;
        String searchTerm;
        String origninalAliceStory;
        String aliceStory;
        origninalAliceStory = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversation in it, 'and what is the use of a book,' thought Alice 'without pictures or conversations?'";

        aliceStory = origninalAliceStory.toLowerCase();
        aliceStoryLength = aliceStory.length();

        input = new Scanner(System.in);
        System.out.println("Enter the term to search:");
        searchTerm = input.next();
        searchTermLength = searchTerm.length();
        searchTerm = searchTerm.toLowerCase();
        input.close();

        if (aliceStory.contains(searchTerm) == (true)) {
            foundAtIndexOf = aliceStory.indexOf(searchTerm);
            System.out.println("The word of '" + searchTerm + "' was found at the index of: " + foundAtIndexOf + " for a length of " + searchTermLength + " and was subsequently removed from the sentence.\n");
            System.out.println("Old Sentence: " + origninalAliceStory);
            System.out.println("New Sentence: " + origninalAliceStory.substring(0,foundAtIndexOf) + origninalAliceStory.substring(foundAtIndexOf+searchTermLength+1,aliceStoryLength));
        } else {
            System.out.println(searchTerm + " Not Found.");
        }
    }
}
