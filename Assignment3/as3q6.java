import java.util.*;

class as3q6{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=scn.nextInt();
		int arr[];
		arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<n;i++)	arr[i]=scn.nextInt();
		int count=0;
		for(int i=0;i<n;i++)	if (arr[i]!=0)	count++;
		System.out.println("There are " + count + " non-zero elements in the array");
}}



