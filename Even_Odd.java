import java.util.Scanner;
public class Even_Odd
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
        if(n%2==0){
            System.out.println("Entered Number is Even");
         }
        else
         {
             System.out.println("Entered Number is Odd");
          }
     }
}