/* Sina Khajehpour
CS 2263
Prof. Griffith
Description: get the number,subject and the title o the course.
 */
package edu.isu.cs.cs2263;


public class Course {
    Integer number;
    String subject;
    String title;

    //constructor
    public Course(Integer number, String subject, String title) {
        this.number = number;
        this.subject = subject;
        this.title = title;
    }

    //getter and setter
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
