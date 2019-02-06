/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixform;

import java.util.Scanner;

/**
 *
 * @author hardcube
 */
public class MatrixForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
	System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][] = new int[row][column];
	System.out.println("Enter matrix:");
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
        	array[i][j] = s.nextInt();
        	System.out.print(" ");
            }
  	}
	System.out.println("The above matrix before Transpose is ");
  	for(i = 0; i < row; i++)
    	{
      	    for(j = 0; j < column; j++)
            {
          	System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    
}
