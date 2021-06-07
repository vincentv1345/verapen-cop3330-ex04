package org.example;

import java.util.Scanner;

/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  *  Copyright 2021 Vincent Verapen
 */
public class MadLib
{
    public static void main( String[] args )
    {
        Story create = new Story();
        String noun = create.getNoun();
        String verb = create.getVerb();
        String adjective = create.getAdjective();
        String adverb = create.getAdverb();
        String newStory = create.story(noun, verb, adjective, adverb);
        System.out.println(newStory);
    }
}
