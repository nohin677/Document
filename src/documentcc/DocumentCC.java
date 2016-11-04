/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package documentcc;
import java.util.Scanner;
/**
 *
 * @author nohin6777
 */
public class DocumentCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //prompts the user for the word count
        System.out.print("How many words is your essay: ");
        
        //sets the scanner to get the word count
        Scanner input = new Scanner(System.in);
        int wordCount = input.nextInt();
        
        //creates a new Essay to use the methods in the 'Essay' class
        //and in the inherited 'Document' class
        Essay essay = new Essay();
        essay.setWords(wordCount);
        
        //if the essay is valid length, this code runs
        if(essay.validLength(wordCount) == true){
            System.out.print("\nThis is the right length to be an essay");
            System.out.print("\nPages: " + essay.calculatePages() + "\n");
        
        //if the essay is not valid length, this code runs
        }else{
            System.out.print("\nThis is not the right length to be an essay \n"
                    + "it must be between 1500 and 3000 words\n");
        }
        
        
        
        
        
    }
    
}
