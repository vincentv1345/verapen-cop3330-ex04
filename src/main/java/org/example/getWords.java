package org.example;
import java.util.Scanner;
public class getWords {
    Scanner word = new Scanner(System.in);
    public String getNoun(){
        System.out.print( "Please enter an noun: " );
        return word.nextLine();
    }
    public String getVerb(){
        System.out.print("Please enter an verb: ");
        return word.nextLine();
    }
    public String getAdverb(){
        System.out.print("Please enter an adverb: ");
        return word.nextLine();
    }
    public String getAdjective(){
        System.out.print("Please enter an adjective: ");
        return word.nextLine();
    }
}
