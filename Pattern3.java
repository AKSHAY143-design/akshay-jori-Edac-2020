/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author A
 */
public class Pattern3 {
    public static void main(String args[])
    {
        int row=9,j,k;
        for(int i=1;i<10;i++)  //rows
        {
            for(j=row-i;j>0;j--) //spaces
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)  //print *
            {
               System.out.print("* "); 
            }
            System.out.println();
        }
    }
    
}
