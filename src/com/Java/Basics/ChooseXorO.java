package com.Java.Basics;
import java.util.Scanner;
public class ChooseXorO 
{
    static char[] cell = new char[10];
    static char player, computer;
    Scanner scanner = new Scanner(System.in);

    public void initialize() 
    {
        for (int i = 1; i < 10; i++) 
        {
        	cell[i] = ' ';
        }
    }
    
    /*
     * Players Choice for taking Either X or O
     */
    public void check()
    {
        System.out.println("Please Select Your Choice : 'X' or 'Y' ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X')
        {
            player = 'X';
            computer = 'O';
        } 
        else if (choice == 'Y') 
        {
            player = 'O';
            computer = 'X';
        }
    }
	   public static void main(String[] args) 
	   {
		ChooseXorO obj = new ChooseXorO();
		System.out.println("Welcome to TIC_TAC_TOE game");
		System.out.println();
        System.out.println(cell[1] + " | " + cell[2] + " | " + cell[3]);
        System.out.println("---------");
        System.out.println(cell[4] + " | " + cell[5] + " | " + cell[6]);
        System.out.println("---------");
        System.out.println(cell[7] + " | " + cell[8] + " | " + cell[9]);
        System.out.println();
        obj.check();
        
		}
}
