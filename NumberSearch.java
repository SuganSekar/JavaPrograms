/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersearch;

import java.util.Scanner;

/**
 *
 * @author hardcube
 */
public class NumberSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "2345678";
        StringBuilder output = new StringBuilder();
        for(char c : input.toCharArray()) {
        if(Character.getNumericValue(c) % 2 == 0) {
            output.append(c);
    }
}
    System.out.println(output.toString());
}}  

        
