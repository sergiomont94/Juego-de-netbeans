/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Sergio Montoya
 */
public class Juego {
   
public static void main(String[] args)
{
Random random = new Random();
Scanner scanner = new Scanner(System.in);

int userChoice, computerChoice;
System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Scissors):");
userChoice = scanner.nextInt();
if(userChoice < 0 || userChoice > 2)
{
System.out.println("Invalid choice. Ending program.");
System.exit(0);
}

computerChoice = random.nextInt(3);

if(userChoice == computerChoice)
{
if(userChoice == 0)
{
System.out.println("Both players chose rock!");
}
else if (userChoice == 1)
{
System.out.println("Both players chose paper!");
}
else
{
System.out.println("Both players chose scissors!");
}

System.exit(0);
}
if(userChoice == 0) 
{
if(computerChoice == 1)
{
System.out.println("You chose rock; Computer chose paper");
System.out.println("Computer wins!");
}
else
{
System.out.println("You chose rock; Computer chose scissors");
System.out.println("You win!");
}
}
else if(userChoice == 1) 
{
if(computerChoice == 0)
{
System.out.println("You chose paper; Computer chose rock");
System.out.println("You win!");
}
else
{
System.out.println("You chose paper; Computer chose scissors");
System.out.println("Computer wins!");
}
}
else	
{
if(computerChoice == 0)
{
System.out.println("You chose scissors; Computer chose rock");
System.out.println("Computer wins!");
}
else
{
System.out.println("You chose scissors; Computer chose paper");
System.out.println("You win!");
}
}
scanner.close();
}
}

