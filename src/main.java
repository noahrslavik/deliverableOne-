import java.util.Scanner;

public class main {

	
	public static void main(String[]args) {
		
	Scanner kbd = new Scanner(System.in);
	String vacationType;
	String groupResult = "";
	String vacationResult = ""; 
	int groupSize;
	String result; 
	
	
	System.out.println("Enter the type of vacation you would like to go on, musical, tropical, or adventurous?: ");
	vacationType = kbd.next();
	vacationType = vacationType.toLowerCase();
	System.out.println(vacationType);
	
	System.out.println("How many are in your group?: ");
	groupSize = kbd.nextInt();
	
	
	System.out.println(vacationType);
	System.out.println(groupSize);
	
	
	switch(vacationType)
	{
	   
		case  "musical" :
			
			vacationResult = " tour of New Orleans"	;
				break;	
			
	   
	   case "tropical" :

		   vacationResult = " beach vacation in Mexico";
		   		break; // break is optional
	   
	   
	   case "adventurous" :

		   vacationResult = " whitewater rafting trip in the Grand Canyon";
	   			break; 
	   
	   default : 
		   vacationResult = "n imaginary island. Try again with a prompted value.";
		   
		   
	}
	
	
	
	if(groupSize == 0)
	{
		{
			
			groupResult = "larger group";
		
		}
	}
		
	
	
	if(groupSize > 0 && groupSize <=2)
		{
		
			groupResult = "first class";
		
		}
	
	if(groupSize > 2 && groupSize <=5)
		{
		
			groupResult = "helicopter";
		
		}

	if(groupSize >= 6) 
		{
	
			groupResult = "charter flight";
	
		}
	
	
	result = ("Since you're a group of "+ groupSize + " going on a " + vacationType + " vacation, you should take a " + groupResult + " to a" + vacationResult) ;
	
	
	
	System.out.println(result);
	
	
		
	}

}
