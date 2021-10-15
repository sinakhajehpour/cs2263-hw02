/* Sina Khajehpour
CS 2263
Prof. Griffith
Description: pushbacktokenizer class that implements pushbackabletokenizer and
has pushback,hasmoretokens,nexttoken and pushbacktokenizer methods in it.
 */
package edu.isu.cs.cs2263.adapter;
import java.util.Stack;

public class PushbackTokenizer implements PushbackableTokenizer {
    private Stack<String> stack,tempStack;
    private String data;
    public PushbackTokenizer(String data){
        stack = new Stack<>();
        tempStack = new Stack<>();
        this.data = data;
        String[] tokens = data.split(" ");
        for(String s:tokens)
        {
            tempStack.push(s);
        }

    }
    @Override
    public String nextToken() {
        if(hasMoreTokens())
            return stack.pop();
        else
            return null;
    }

    @Override
    public boolean hasMoreTokens() {
        if(!stack.isEmpty())
            return true;
        else
            return false;

    }

    @Override
    public void pushBack() {
        stack.push(tempStack.pop());
    }
}



