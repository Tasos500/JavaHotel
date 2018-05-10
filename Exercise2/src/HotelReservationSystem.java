import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
	
	public static void main(String [] ags) 
	{
		Scanner in = new Scanner (System.in);
		Amenity[] hotelAmenity = new Amenity[100];
		StandardRoom[] hotelStandard = new StandardRoom[100];
		String[] codeList = new String[100];
		String[] roomList = new String[100];
		int sRoomNum = 0;
		int indexAmenity = 0;
		int roomNum = 0;
		int menuInput = 69;
		char specInput;
		do
		{
		System.out.println("\n[1] Insert Amenity\n[2] Insert Room (Standard or Superior)\n[3] Insert Client\n[4] Book Room\n[5] Cancel Room Reservation\n[6] Order Amenity (Available only in Superior Rooms\n[7] Hotel Capacity\n[8] Room Availability\n[0] Exit");
		System.out.println("\nYour choice: ");
		menuInput = in.nextInt();
		switch(menuInput)
		{
			case 1:
				System.out.println("Enter Amenity Code: ");
				String codeInput = in.next();
				
				int codecheck = 0;		
				
			
					for(int i = 0 ; i < indexAmenity; i++){
						
						if (codeList[i].equals(codeInput)){
						
						codecheck = 1;
						
						break;
						
					}
					
				}
					
				
				if (codecheck == 0){
					codeList[indexAmenity] = codeInput;
					
				}else {
					System.out.println("Error: Code already exists.");
					break;
				}
					
					
					
				
				System.out.println("Enter Amenity Category: ");
				String categoryInput = in.next();
				System.out.println("Enter Amenity Description: ");
				String descriptionInput = in.next();
				System.out.println("Enter Amenity Price: ");
				double aPriceInput = in.nextDouble();
				hotelAmenity[indexAmenity] = new Amenity(codeInput, categoryInput, descriptionInput, aPriceInput);
				indexAmenity++;
				for(int i = 0 ; i < codeList.length; i++){
					
					System.out.println(codeList[i]);
					
				}
				
				
				
				break;
			case 2:
				System.out.println("\n[a] Insert a standard room\n[b] Insert a superior room");
				System.out.println("\nYour choice: ");
				specInput = in.next().charAt(0);
				switch(specInput)
				{
					case 'a':
						System.out.println("Enter Room Number: ");
						String roomInput = in.next();
						int roomCheck = 0;
						for (int j = 0; j < roomNum; j++)
						{
							if (roomList[j].equals(roomInput))
							{
								roomCheck = 1;
								System.out.println("Error: Room already exists.");
							}
						}
						if (roomCheck == 0)
						{
							System.out.println("Enter Floor: ");
							int roomFloor = in.nextInt();
							System.out.println("Enter capacity: ");
							int roomCap = in.nextInt();
							System.out.println("Enter price: ");
							double roomPrice = in.nextDouble();
							hotelStandard[sRoomNum] = new StandardRoom(roomInput, roomFloor, roomCap, roomPrice);
							roomNum++;
							sRoomNum++;
						}
						break;
					case 'b':
						
						break;
					default:
						System.out.println("Undefined argument.");
						break;
				}
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 0:
				break;
			default:
				System.out.println("Undefined argument.");	
				break;	
		}
		}
		while (menuInput != 0);
		
		
		in.close();
	}
	

}
