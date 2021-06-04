package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MadLib
{
    public static void main( String[] args )
    {
        Scanner noun = new Scanner(System.in);
        Scanner verb = new Scanner(System.in);
        Scanner adjective = new Scanner(System.in);
        Scanner adverb = new Scanner(System.in);
        System.out.println( "Please enter an noun: " );
        String newNoun = noun.next();
        System.out.println("Please enter an verb: ");
        String newVerb = verb.next();
        System.out.println("Please enter an adjective: ");
        String newAdjective = adjective.next();
        System.out.println("Please enter an adverb: ");
        String newAdverb = adverb.next();
        Story create = new Story();
        String newStory = create.story(newNoun, newVerb, newAdjective, newAdverb);
        System.out.println(newStory);
    }
}
