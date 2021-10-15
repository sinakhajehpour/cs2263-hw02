/* Sina Khajehpour
CS 2263
Prof. Griffith
Description: the interface
 */
package edu.isu.cs.cs2263.adapter;
public interface PushbackableTokenizer {
    /**
     *
     * @return the next token
     */
    public String nextToken();

    /**
     *
     * @return if there is at least one more token; else false
     */
    public boolean hasMoreTokens();

    /**
     * The last token read and is pushed back
     * So it can be read again using nextToken.
     */
    public void pushBack();
}