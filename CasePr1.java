public class CasePr1 
{

	public static void main(String[] args) 
	{
	
		  String str1="1- i  am happy. 2- I AM SMALL";    
	      StringBuffer SB=new StringBuffer(str1);    
	            
	        for(int i = 0; i < str1.length(); i++) 
	        {    
	                
	            //Checks for lower case letter convert into upper case using toUpperCase()    
	            if(Character.isLowerCase(str1.charAt(i))) 
	            {        
	                SB.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
	            }    
	            //Checks for upper case letter convert into lower case using tolowerCase()    
	            else if(Character.isUpperCase(str1.charAt(i))) 
	            {   
	                SB.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
	            }    
	        }    
	        System.out.println("String after case converrt : " + SB); 
	}

}
