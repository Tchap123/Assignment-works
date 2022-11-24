import java.lang.*;

class pattern5{
	public static void main(String args[]){
		for (int i=1;i<=8;i++){
			if (i==1 || i==8){
				for (int j=1;j<=8;j++)
					System.out.print("#");
			}
			else{
				for (int j=1;j<=8;j++){
					if (j==1||j==8)
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
}}
