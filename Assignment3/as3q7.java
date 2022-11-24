import java.util.*;

class as3q7{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=10;
		int arr[];
		arr=new int[n];
		System.out.println("Enter 10 elements to an array: ");
		for (int i=0;i<10;i++)
			arr[i]=scn.nextInt();
		for (int i=0;i<(n-1);i++){
			for (int j=i+1;j<n;j++){
				if (arr[i]+arr[j]==50)
					System.out.println("( " + arr[i] + "," + arr[j] + " )" );
			}
		}
}}


