import java.util.Scanner;

class CarParkingService {
	static int slots[] =new int [5];

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int service ;
		int slotnum, slotNumber;


		
		


		while(true){
			System.out.println("\n******************");
			System.out.println("Car parking System");
			System.out.println("******************");
			System.out.println("1. Park car");
			System.out.println("2. UnPark car");
			System.out.println("3. View All Parking Slots");
			System.out.println("4. View Specific Parking Slot");
			System.out.println("5. Exit car park");
			System.out.println("Enter the options(1-5)");
			service = sc.nextInt();


			switch(service){
			case 1 :
					System.out.println("Park car");
					System.out.println("Enter the car's number");
					int carNumber = sc.nextInt();
					 slotNumber = getFreeSlot();
					if(slotNumber != -1){
						slots[slotNumber] = carNumber;
						System.out.println("Your car has been parked at Slot Number " + (slotNumber + 1));

					}else{
						System.out.println("There is no free space to park your car");
					}

					break;
			case 2 :
					System.out.println("Unpark car");
					System.out.println("Enter the slot number to be unparked (1-5)");
					  slotnum =sc.nextInt();
					 if(isSlotFree(slotnum -1) ) {
					 	System.out.println("There is no car parked in the slot number: "+ slotnum );
					 }else{
					 	slots[slotnum -1] = 0;
					 	System.out.println("Your car sucessfully unparked");
					 }

					break;
			case 3 :
					System.out.println("View parking Slots");
					//
					for(int i=0;i<slots.length;i++){
						if(isSlotFree(i)){
						System.out.println("slot " + (i+1)+" --> FREE");
						}
						else{
							System.out.println("slot " +(i+1)+ " -->  "+ slots[i]);
						}
					}
					
					break;

			case 4 : 
					 System.out.println("Enter the slot number to be viewed (1-5)");
					  slotnum =sc.nextInt();
					  System.out.println(slots[slotnum-1]);
					  if(isSlotFree(slotnum -1) ) {
					 	System.out.println("Slot number: "+ slotnum +" is Free");
					 }else{
					 	System.out.println("Slot number: "+ slotnum +" is not Free " + "and occupied by car number " + slots[slotnum-1]) ;
					 }	

					  /*
					 if(isSlotFree(slotnum -1) ) {
					 	System.out.println("Slot number: "+ slotnum +" is Free");
					 }else{
					 	System.out.println("Slot number: "+ slotnum +" is not Free");
					 }*/
					 

					 break;
			case 5 :
					System.out.println("Thanks for using car parking ");
					

					System.exit(0);
					break;

			
			
			default :
					 System.out.println("Wrong Input");
					 break;

			}

		}


	}

	public static boolean isSlotFree(int slotNumber){
		boolean isFree = false;
		if(slots[slotNumber] == 0 ){
			isFree = true;
		}
			
		return isFree;
			
	}
	public static int getFreeSlot(){
		int freeSlotIndex = -1;

		for(int i=0;i<slots.length;i++){
			if(isSlotFree(i)){
				freeSlotIndex = i;
				break;
			}
						
		}
		return freeSlotIndex;

	}





	
	
}
