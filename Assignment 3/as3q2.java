import java.lang.*;
import java.util.Scanner;
import java.lang.Math;


class prfctnum{
	public static void main(String args[]){
		int n=1000;
		System.out.println("Perfect number: ");
		for (int i=1; i<=n; i++){
			int summ=0,m=i/2;
			for (int j=1; j<=m; j++){
				if (i%j==0)	summ+=j;}
			if (summ==i)	System.out.println("\t" + i);
		}
	}
}

