/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment4;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author qscot
 */
public class ProgrammingAssignment4 {

    /**
     * @param args the command line arguments
     */
    
    static MyLinkedList[] dictionary = new MyLinkedList[26];
    
    public static void main(String[] args) {
        // TODO code application logic here
        initializeDictionary();
    }
    
    
    private static void initializeDictionary() {  
        for (int i = 0; i < 26; i++) {
            dictionary[i] = new MyLinkedList<String>();
            
        }
        String currentWord;
        try (Scanner reader = new Scanner(new File("random_dictionary.txt"))) {
            while (reader.hasNextLine()) {
                currentWord = reader.nextLine();
            dictionary[currentWord.charAt(0) - 97].add(currentWord);       
            }
            
         
            
            
        }
        catch (FileNotFoundException ex)
        {
          System.out.println("The dictionary file could not be found");  
            
        }
    }
    
}
