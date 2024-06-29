/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lettercounter;
import javax.swing.JOptionPane;
/**
 *
 * @author MKAY
 */
public class LetterCounter {

    public static void main(String[] args) {
        String userStringInput; // For holding sentence(s) entred by user
        String input; // For holding JOptionPane strings
        char userCharInput; //Holds the char input of user
        int alphabetOccurence = 0; // Counts the number of time the alphabet occurs in sentence(s)
        int charPositionHolder = 0; //Holds the alphabets' positions and also is used as a loop counter
        
        
        userStringInput = JOptionPane.showInputDialog("Enter a sentence (or as many as you wish)");
        
        input = JOptionPane.showInputDialog("Enter any alphabet from your sentence");
        userCharInput = input.charAt(0);
        
        while(input.length()>1)
        {
           input = JOptionPane.showInputDialog("You have entered multiple characters. Alphabet considered is: " + userCharInput + "\n Do you want to change the alphabet (Enter 'yes' if you want to): ");
           if(input.equalsIgnoreCase("yes"))
                   {
                       input = JOptionPane.showInputDialog("Enter any alphabet from your sentence");
                       userCharInput = input.charAt(0);
                   }
        }
        
        charPositionHolder = charPositionHolder + (userStringInput.length() - 1);     // 1 is subtracted so that the charAt() can funtion properly
        
        while(charPositionHolder != -1)
        {
            
            if (userStringInput.charAt(charPositionHolder) == userCharInput)
            {
                alphabetOccurence++;
            }
            
            charPositionHolder--;
            
        }
            JOptionPane.showMessageDialog(null, "The Alphabet you entered occurs " + alphabetOccurence + " times");
    }
}
