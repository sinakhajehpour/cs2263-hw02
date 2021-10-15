/* Sina Khajehpour
CS 2263
Prof. Griffith
Description: testing the pushbacktokenizer
 */
package edu.isu.cs.cs2263.adapter;

public class Main {
    public static void main(String[] args)
    {
        PushbackTokenizer pushbackTokenizer = new PushbackTokenizer("This is a test");
        pushbackTokenizer.pushBack();
        pushbackTokenizer.pushBack();
        pushbackTokenizer.pushBack();
        pushbackTokenizer.pushBack();
        while (pushbackTokenizer.hasMoreTokens()) {
            System.out.println(pushbackTokenizer.nextToken());
        }

    }
}