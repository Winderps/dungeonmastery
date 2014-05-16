package com.fingersome.dungeonmasterycore.lib;

public class Dice   
{  
   private int d2;   	// Instance variable for d2  
   private int d4;   	// Instance variable for d3
   private int d6;		// Instance variable for d3
   private int d8;		// Instance variable for d3
   private int d10;		// Instance variable for d3
   private int d12;		// Instance variable for d3
   private int d20;		// Instance variable for d3
   private int sum;    	// Instance variable to hold sum of dice thrown
     
   
   
   public void Roller() // default to 20-sided dice  
   {  
        rolld20();  // Calls the roll() method to roll the dice.  
   }  
     
   public int getValue() // Return the value of the thrown die  
   {  
        return d20;  
   }  

 
   
   public void rolld2()   //Rolls a 2 sided dice
   {  
        d2 = (int)(Math.random()*2) + 1; 
   }  
   
   public void rolld4()   
   {  
        d4 = (int)(Math.random()*4) + 1; 
   }  
   
   public void rolld6()   
   {  
        d6 = (int)(Math.random()*6) + 1; 
   }  
   
   public void rolld8()   
   {  
        d8 = (int)(Math.random()*8) + 1; 
   }  
   
   public void rolld10()   
   {  
        d10 = (int)(Math.random()*10) + 1; 
   }  
   
   public void rolld12()   
   {  
        d12 = (int)(Math.random()*12) + 1; 
   }  
   
   public void rolld20()   
   {  
        d20 = (int)(Math.random()*20) + 1; 
   }   
		     
}    
   
  