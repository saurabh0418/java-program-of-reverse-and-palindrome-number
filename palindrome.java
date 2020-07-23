import java.util.Scanner;
public class Palindromereverse{
	public static void main(String[] args) {
		int n;
		Scanner X =new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		n=X.nextInt();
		
		int reversedNo=0;
		
		int temp=n;
		while(temp>0)
		{ 
		 int lastDigit = temp%10;
		 
		 reversedNo=reversedNo*10+lastDigit;
		 temp/=10;
		}
		System.out.println("REVERSED OF NO IS = "+reversedNo);
		
	if(reversedNo == n)
 { System.out.println("THE GIVEN NUMBER " + n + " IS PALINDROME ");
 			}
     else
			{ System.out.println("THE GIVEN NUMBER " + n + " IS  NOT PALINDROME ");
			}
		}
}


		
	