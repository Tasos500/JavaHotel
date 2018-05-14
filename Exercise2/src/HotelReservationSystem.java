import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;

public class HotelReservationSystem {
	
	public static void main(String [] ags) 
	{
		Scanner in = new Scanner (System.in);
		Amenity[] hotelAmenity = new Amenity[100];
		StandardRoom[] hotelStandard = new StandardRoom[100];
		SuperiorRoom[] hotelSuperior = new SuperiorRoom[100];
		Reservation[] hotelReservation = new Reservation[100];
		String[] codeList = new String[100];
		String[] roomList = new String[100];
		String idInput;
		int roomFloor;
		int roomCap;
		String roomAmenities;
		double roomPrice;
		String datePattern = "dd/MM/yyyy";
		String roomInput;
		int roomCheck;
		SimpleDateFormat df = new SimpleDateFormat(datePattern);
		String resInDate = "null";
		String resOutDate = "null";
		int resCount = 0;
		boolean resBetween;
		Date inDate;
		Date outDate;
		int resOccupants;
		String amenityInput;
		double discountInput;
		double payoutInput;
		int stRoomNum = 0;
		int suRoomNum = 0;
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
						roomInput = in.next();
						roomCheck = 0;
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
							roomFloor = in.nextInt();
							System.out.println("Enter capacity: ");
							roomCap = in.nextInt();
							System.out.println("Enter price: ");
							roomPrice = in.nextDouble();
							hotelStandard[stRoomNum] = new StandardRoom(roomInput, roomFloor, roomCap, roomPrice);
							roomNum++;
							stRoomNum++;
						}
						break;
					case 'b':
						System.out.println("Enter Room Number: ");
						roomInput = in.next();
						roomCheck = 0;
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
							roomFloor = in.nextInt();
							System.out.println("Enter capacity: ");
							roomCap = in.nextInt();
							System.out.println("Enter price: ");
							roomPrice = in.nextDouble();
							System.out.println("Enter amenities, separated by commas: ");
							roomAmenities = in.next();
							hotelSuperior[suRoomNum] = new SuperiorRoom(roomInput, roomFloor, roomCap, roomPrice, roomAmenities);
							roomNum++;
							suRoomNum++;
						}
						break;
					default:
						System.out.println("Undefined argument.");
						break;
				}
				break;
			case 3:
				
				break;
			case 4:
				//Input of check-in date.
				System.out.println("Enter date of check-in (DD/MM/YYYY): ");
				//Check of date format.
				try
				{
					resInDate = in.next();
					inDate = df.parse(resInDate);
				}catch (ParseException e)
				{
					e.printStackTrace();
				}
				//Repeat for check-out date.
				System.out.println("Enter date of check-out (DD/MM/YYYY): ");
				try
				{
				resOutDate = in.next();
				outDate = df.parse(resOutDate);
				}catch (ParseException e)
				{
					e.printStackTrace();
				}
				if (resCount != 0)
				{
					//TODO: Check for reserved rooms.
				}
				System.out.println("Enter room number from the above: ");
				roomInput = in.next();
				System.out.println("Enter number of occupants: ");
				resOccupants = in.nextInt();
				//TODO: Check if input occupants are over the max for the chosen room.
				System.out.println("Enter client ID: ");
				idInput = in.next();
				//TODO: Check if ID exists. (After Case 3 is implemented.)
				System.out.println("Enter codes of requested amenities, separated by comma and space: ");
				amenityInput = in.next();
				System.out.println("Enter discount percentage, if applicable (0 means no discount): ");
				discountInput = in.nextDouble();
				System.out.println("Enter payout for room: ");
				payoutInput = in.nextDouble();
				hotelReservation[resCount] = new Reservation (roomInput, resOccupants, idInput, resInDate, resOutDate, amenityInput, discountInput, payoutInput);
				resCount++;
				
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
