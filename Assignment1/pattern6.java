import java.lang.*;

class pattern6{
	public static void main(String args[]){
	       for (int i=0;i<8;i++){
			if (i==0||i==7){
		 		for (int j=0;j<8;j++)
					System.out.print("#");
			}
			else{
				for (int j=0;j<8;j++){
					if (i==j)
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
}}	       
