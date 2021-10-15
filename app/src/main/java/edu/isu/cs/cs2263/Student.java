/* Sina Khajehpour
CS 2263
Prof. Griffith
Description: get students' names and last names and make a list of students' courses .
 */
package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List courseList;
    //constructor
    public Student(String firstName, String lastName,List courseList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseList=courseList;
    }
    //getter and setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //adding student's courses to the list
    public List getCourseList() {
        return courseList;
    }
    public void setCourseList(List courseList) {
        this.courseList = courseList;
    }
    public List courseList(Course course){
        List<Course> courseList=new ArrayList<>();
        courseList.add(course);
        return courseList;
   }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
