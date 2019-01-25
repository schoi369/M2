package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
<<<<<<< HEAD
 *  modified string 
 *  
=======
 *  modified string
 *
>>>>>>> aded0f8a8d1ec4a6b52ef778226c09b16156d444
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
<<<<<<< HEAD
     * where each character is 1 greater 
=======
     * where each character is 1 greater
>>>>>>> aded0f8a8d1ec4a6b52ef778226c09b16156d444
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
<<<<<<< HEAD
      //Person 4 put your implementation here
      return null;
    }
    
=======
      if (input == null) {
            throw new IllegalArgumentException(
                "Cannot insert null data in to data structure.");
        }
        String answer = "";
        char add = '0';
        for (int i = 0; i < input.length(); i++) {
            add = input.charAt(i);
            add += 1;
            answer += add;
        }
        return answer;
    }

>>>>>>> aded0f8a8d1ec4a6b52ef778226c09b16156d444
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
<<<<<<< HEAD
     * @return the string representing the 
=======
     * @return the string representing the
>>>>>>> aded0f8a8d1ec4a6b52ef778226c09b16156d444
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

