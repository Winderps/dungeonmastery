package com.fingersome.dungeonmastery.lib;


public class Dice   
{  
   private static int diceValue; // Value of the dice rolled
   private int modValue; // Value of roll modifier

   
   public int getValue() // Return the value of the thrown die  
   {  
	   return diceValue;  
   }  
     
   public static int roll(int diceSides, int modifier)	
   //Calculates the sum of the number on the dice and the roll modifer
   {
	   diceValue = (int)(Math.random()*diceSides)+modifier;
	   
	   return diceValue;
   }
		     
}    
   
  