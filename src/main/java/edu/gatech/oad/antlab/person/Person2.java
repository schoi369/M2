package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
<<<<<<< HEAD
=======

import java.util.ArrayList;
import java.util.List;

>>>>>>> aded0f8a8d1ec4a6b52ef778226c09b16156d444
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
<<<<<<< HEAD
	  return null;
=======
	    List<Character> chars = new ArrayList<Character>();
        for(char c : input.toCharArray()){
            chars.add(c);
        }

        String output = "";

        while(chars.size() != 0) {
        	int randNumber = (int)(Math.random() * chars.size());
        	output = output + (chars.remove(randNumber));
        }
        
        return output;
>>>>>>> aded0f8a8d1ec4a6b52ef778226c09b16156d444
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
