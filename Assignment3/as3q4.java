import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

class arrex{
	public static void main(String args[]){
		int arr[];
		int max=0,min=1,size=arr.length;
		System.out.print("Array before exchange: arr= " + Arrays.toString(arr));
		for (int i=0;i<size;i++){
			if (arr[i]>max)	{max=arr[i];}
			else if (arr[i]<min)	{min=arr[i];}}
		System.out.println("Min: " + min + "Max: "+ max);
		for (int i=0;i<size;i++){
			if (arr[i]==min)	{arr[i]=max;}
			else if (arr[i]==max)	{arr[i]=min;}}
		System.out.println("Array after exchange: arr= " + Arrays.toString(arr));
}}
		
