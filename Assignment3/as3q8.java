import java.util.*;
import java.lang.*;

class as3q8{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=0;
		System.out.println("Enter the no. of elements in array: ");
		n=scn.nextInt();
		int arr[];
		arr= new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<n;i++)	arr[i]=scn.nextInt();
		int dist=n,a=0,b=0,flag=0,k=0;
		for (int i=0;i<(n-1);i++){
			flag=0;
			dist=n;
			for (int j=0;j<n;j++){
				if ((arr[j]+1)==arr[i]||(arr[j]-1)==arr[i]){
					a=arr[i];
					b=arr[j];
					flag=1;
					k=Math.abs(j-i);
					if (k<dist)
						dist=k;
				}
			}
			if (flag==1)
				System.out.println("The minimum distance between " + a + " and " + b + " is " + dist);
		}
}}

				



