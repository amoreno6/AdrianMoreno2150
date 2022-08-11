/**
* Class name: ReviewProgram.java
* Author: Adrian Moreno
*
* Date: August 11, 2022
* Version 1.1
* Description: 

import java.uti.Scanner:
public class ReviewProgram
{
  
public static void main (String [] args)
{
  ReviewProgram rp = new ReviewProgram();
  System.out.println("Enter two numbers");
  Scanner input = new Scanner(System.in);
  int number1 = input.nextIn();
  int number2 = input.nextInt();
  
  int result = rp.add(number1, number2);
  System.out.println("Result of two numbers " + number1 + " and " + number2 + " is " + result);
  
  int resultStatic = addStatic(number1, number2)
  
  System.out.println("Result of two numbers " + number1 + " and " + number2 + " is " + result);
}
  
  public int add(int firstNum, int secondNum)
  {
    return firstNum + secondNum;
  }
  public static int addStatic(int firstNum, int secondNum)
  {
  
  }
}
