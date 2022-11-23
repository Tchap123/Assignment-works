import java.util.*;

class passengers{
	String name;
	int age;
	String seatchoice;
	public void passengers(){
		System.out.println("Enter the name: ");
		this.name=scn.nextLine();
		System.out.println("Enter the age: ");
		this.age=scn.nextInt();
		System.out.println("Enter the Seat choice: ");
		Sytem.out.println("
		this.seatchoice=nextLine();
	}
}

class reservation{
	String pname;
	String seatalloted;
	public static reservation(){
		this.pname=namep;
		this.seatalloted=pseatalloted;
	}
	public static otherseat(arr[i].seatchoice){
		if
	void display(){
		System.out.println("Passenger name: " + name );
		System.out.println("Seat alloted: " + seatalloted);
	}
}


class as2q1{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		
		//Program is just limited for 24 seats as per the constraints set
		System.out.println("Total seats left is 24");
		System.out.println("The Seats are reserved for female");
		int upside=3,lowside=3,up=6,mid=6,low=6,n=24;
		int arr[];
		
		//Array initialisation for Passenger class
		passengers arr[];
		arr = new details[24];

		//Array initialisation for reservation class
		reservation arrr[];
		arrr=new reservation[24];

		for (int i=0;i<24;++i){
			arr[i].passsengers();
		}
		
		//Alloting seats to senior citizen
		for (int i=0;i<24;i++){
			if (arr[i].age>=65){
				switch(arr[i].seatchoice){
					case "low":
						if (low>0){
							System.out.println("Seat booked");
							low--;
							arrr[i].pname=arr[i].name;
							arrr[i].seatallocated="low";
						}
						else{
							System.out.println("Seat filled up");
							System.out.println("Alloting to other empty seats");

						}
					case "mid":
						if (mid>0){
							System.out.println("Seat booked");
							mid--;
							arrr[i].pname=arr[i].name;
							arrr[i].seatallocated="mid";
						}
						else{
							System.out.println("Seat filled up");
							System.out.println("Alloting to other empty seats");
						}
					case "up":
						if (up>0){
							System.out.println("Seat booked");
							up--;
							arrr[i].pname=arr[i].name;
							arrr[i].seatallocated="up";
						}
						else{
							System.out.println("Seat filled up");
							System.out.println("Alloting to other empty seats");
						}
					case "upside":
						if (upside>0){
							System.out.println("Seat booked");
							upside--;
							arrr[i].pname=arr[i].name;
							arrr[i].seatallocated="upside";
						}
						else{
							System.out.println("Seat filled up");
							System.out.println("Alloting to other empty seats");
						}
					case "lowside":
						if (lowside>0){
							System.out.println("Seat booked");
							lowside--;
							arrr[i].pname=arr[i].name;
							arrr[i].seatallocated="lowside";
						}
						else{
							System.out.println("Seat filled up");
							System.out.println("Alloting to other empty seats");
						}






		//Now to allot the seats to the 
		for (int i=0;i<24;i++){
			switch(arr[i].seatchoice){
				case "low":
					if (low>0){
						System.out.println("Seat booked");
						low--;





















