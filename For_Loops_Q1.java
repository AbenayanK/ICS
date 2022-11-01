import java.util.Scanner;

public class For_Loops_Q1 {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);  

 
    int retry = 1;  
while(retry!=0) {
	System.out.println("Do you want to enter your number(0 for no): ");  
    retry = sc.nextInt(); 
	 int fact=1;
     //creating object of Scanner class  

     //accepting a number from the user  
	 if (retry != 0 ) {
		System.out.println("Enter a number whose factorial is to be found: ");  
     int num = sc.nextInt();  
       
     //counting the factorial using while loop  
     for(int i=1;i <= num; i+=1){  
     	fact=fact*i;
     }     
     System.out.println("\nFactorial of " + num + " is: " +fact); 
	 }
       
}
System.out.println("Bye");
       }  
}  
