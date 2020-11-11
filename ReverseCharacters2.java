package src;
/**
 * CUS-1126
 * Project 2 - Group 4
 * @author Iftikhar Tapadar, Pierce Montgomery, George Britton
 */

import jsjf.LinkedStack;
import java.util.Scanner;


public class ReverseCharacters2 {

    /**
     * 1) Reads a sentence and reverses the characters of each word using a stack.
     *
     * 2) Reads a sentence  using a stack
     */
    public static void main(String[] args) {
        LinkedStack<Character> stack1 = new LinkedStack<Character>();
        LinkedStack<Character> stack2 = new LinkedStack<Character>();
        String sentence = "", word = "";

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            sentence = in.nextLine();

            System.out.println("Reversing Each Word: ");
            //Iterates through user input
            for (int i = 0; i < sentence.length(); i++){
                char c = sentence.charAt(i);
                //Stores each char in word variable unless it has whitespace
                //Seperates it by word
                if (!Character.isWhitespace(c)){
                    stack1.push(c);
                    //c is added to word variable
                    word += c;
                }
                //If it runs into white space during iteration this will execute
                else if (Character.isWhitespace(c)){
                    word = "";
                    int sizeHold1 = stack1.size();
                    //Iterates through entire size of the stored stack
                    for (int j = 0; j < sizeHold1; j++) {
                        //Pops off in reverse order and prints
                        System.out.print(stack1.pop());
                    }
                    //Adds whitespace
                    System.out.print(" ");
                }
            }

            //Second variable that will hold size of the stack
            int sizeHold2 = stack1.size();
            //Iterates through size of stack
            for (int j = 0; j < sizeHold2; j++) {
                //Prints out each word with the characters reversed
                System.out.print(stack1.pop());
            }

            System.out.println("\nReversing Sentence: ");
            //Iterates through length of user input
            for (int k = 0; k < sentence.length(); k++){
                //Adds characters from user input to store in x
                char x = sentence.charAt(k);
                //Pushes x into stack2
                stack2.push(x);
            }
            //Iterates and prints stack2 in reverse including all characters and whitespace
            for (int i = 0; i < sentence.length(); i++){
                System.out.print(stack2.pop());
            }
        }
        catch (Exception IOException){
            System.out.println("Input exception reported");
        }
    }
}