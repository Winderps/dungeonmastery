package com.fingersome.dungeonmasterycore.lib;

public class Dice   
{  
   private int diceValue; // Value of the dice rolled
   private int modValue; // Value of roll modifier

   
   public int getValue() // Return the value of the thrown die  
   {  
	   return 20;  
   }  

   public void dice() // Rolls a dice 
   {  
	   roll(getValue(), 1);  // Calls the roll() method
   }  
     
   public int roll(int diceSides, int modifier)	//Calculates the sum of the number on the dice and the roll modifer
   {
	   diceValue = (int)(Math.random()*diceSides)+modifier;
	   
	   return diceValue;
   }
		     
}    
   
  