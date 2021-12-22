package studios.controlflowandcollections;


import java.util.*;
import java.lang.*;


public class CountingCharacters {
    public static void main(String[] args) {

        HashMap<String, Integer> theAlphaBet = new HashMap<>();
//        StringBuilder singleCharacter = new StringBuilder();
        String mixedCaseParagraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once youve done that, its pretty straightforward from there.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String paragraph = mixedCaseParagraph.toLowerCase();
        paragraph = paragraph.replace(" ", "");
        paragraph = paragraph.replace(".", "");
        paragraph = paragraph.replace(",", "");
        paragraph = paragraph.replace("\'", "");
        char singleCharacter = ' ';
        char[] alphabetSplit = alphabet.toCharArray();
        char[] paragraphSplit = paragraph.toCharArray();


        for (int i = 0; i < alphabetSplit.length; i++) {
            singleCharacter = (alphabetSplit[i]);
            theAlphaBet.put(String.valueOf(singleCharacter),0);
        }
        for (int i = 0; i < paragraphSplit.length; i++) {
            singleCharacter = paragraphSplit[i];
            Integer characterCount = theAlphaBet.get(String.valueOf(singleCharacter));
            characterCount += 1;
            theAlphaBet.put(String.valueOf(singleCharacter), characterCount);

        }
        System.out.println("\nNumber of Characters Found: " + paragraphSplit.length + "\n");
        System.out.println(theAlphaBet);
    }
}
