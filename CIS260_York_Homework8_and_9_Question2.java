/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package csu.cis260_york_homework8_and_9_question2;

// IMPORTS
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *
 * @author spenceryork
 */
public class CIS260_York_Homework8_and_9_Question2 {

    // MAIN METHOD
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter string
        System.out.println("\nEnter a series of letters to be sorted alphabetically: ");
        String word = input.nextLine();

        // Call sorting method
        System.out.println("\n" + sort(word) + "\n");
    }

    // SORTING METHOD
    public static String sort(String s) {
        char[] wordArr = new char[s.length()];

        // Split wordArr elements into characters 
        for (int i = 0; i < wordArr.length; i++) {
            wordArr[i] = s.charAt(i);
        }

        // Sort array
        Arrays.sort(wordArr);

        // Convert wordArr elements into Stream, collect array elements, and join them together in a single string
        return Stream.of(wordArr)
               .map(arr -> new String(arr))
               .collect(Collectors.joining());
    }
}