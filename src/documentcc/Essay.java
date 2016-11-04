/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package documentcc;

/**
 *
 * @author nohin6777
 */
public class Essay extends Document{
    private final int MIN_WORDS = 1500;
    private final int MAX_WORDS = 3000;
    private boolean valid;
    
    /**
     * sets a default constructor
     * pre: none
     * post: none
     */
    public Essay(){
        
    }
    /**
     * checks if the word count is a valid length
     * pre: none
     * post: returns true if the word count is valid, returns 
     * false if the word count is not valid
     * @param wordCount
     * @return 
     */
    public boolean validLength(int wordCount){
        if(wordCount >= MIN_WORDS && wordCount <= MAX_WORDS){
            valid = true;
        }else{
            valid = false;
        }
        
        return valid;
    }
    
}
