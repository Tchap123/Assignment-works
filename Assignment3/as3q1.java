import java.lang.*;
import java.util.Scanner;

class summ{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the sum of number you want:");
		int n=in.nextInt();
		int summ=0;
		for (int i=0;i<=n;i++){
			summ+=i;
			System.out.println("sum: "+summ);
		}
}}
