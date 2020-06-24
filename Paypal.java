package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Paypal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String as PayPal India
        String s="PayPal India";
        
        // Convert it into a character array
        char[] charArray = s.toCharArray();
        
       //Declare a Set as charSet for Character
        Set<Character> charSet = new LinkedHashSet<Character>();
        //Declare a Set as dupCharSet for duplicate Character
        Set<Character> dupCharSet = new LinkedHashSet<Character>();
        
        //Iterate character array and add it into charSet
        boolean flag=true;
        System.out.println("Elements in Character set: ");
        for (char c : charArray) {
        	if(flag==charSet.add(c)) {
	
        	}
        //if the character is already in the charSet then, add it to the dupCharSet
        	else {
        	     	  dupCharSet.add(c);
	        }
        }
        System.out.println(charSet); 
    	System.out.println("Elements in Duplicate Character Set: " +dupCharSet);
    	
            //Check the dupCharSet elements and remove those in the charSet
        	charSet.removeAll(dupCharSet);
            
        	 //print each character for charSet
			System.out.println("The Character Set after removing Duplicates :");
        	//Iterate using charSet
            for(char eachCharacter:charSet)
        		{
           //Check the iterator variable isn't equals to an empty space
        			if(eachCharacter==' ')
        			{
        	        			}
        			else
        			{
        		  	System.out.println(eachCharacter);
        		}
        	       		
        	}		
		} }
