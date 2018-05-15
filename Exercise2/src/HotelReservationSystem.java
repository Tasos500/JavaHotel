import java.util.ArrayList;
import java.util.Scanner;


public class HotelReservationSystem {
	
	public static void main(String [] ags) 
	{
		Scanner in = new Scanner (System.in);
		int menuInput = 69;
		char specInput;
		
		ArrayList<Amenity> amenityList = new ArrayList<Amenity>(); 
		ArrayList<Room> roomList = new ArrayList<Room>();
		ArrayList<Client> clientList = new ArrayList<Client>();

		
		do
		{
		System.out.println("\n[1] Insert Amenity\n[2] Insert Room (Standard or Superior)\n[3] Insert Client\n[4] Book Room\n[5] Cancel Room Reservation\n[6] Order Amenity (Available only in Superior Rooms\n[7] Hotel Capacity\n[8] Room Availability\n[0] Exit");
		System.out.println("\nInsert your choice: ");
		menuInput = in.nextInt();
		switch(menuInput)
		{
			case 1:
				System.out.println("Enter Amenity Code: ");
				String codeInput = in.next();
				
				int checkAmenityCode = 0;
				
				for(int i = 0; i < amenityList.size(); i++) {
										
					if((((amenityList.get(i))).getCode()).equals(codeInput) ) {
						
						checkAmenityCode = 1;
						break;

					}
																								
				}
				
				if(checkAmenityCode == 1) {
					
					System.out.println("\nThis code already exists...");
					break;
					
				}
				
				
				System.out.println("Enter Amenity Category: ");
				String categoryInput = in.next();
				System.out.println("Enter Amenity Description: ");
				String descriptionInput = in.next();
				System.out.println("Enter Amenity Price: ");
				double aPriceInput = in.nextDouble();
				Amenity amenity = new Amenity(codeInput,categoryInput,descriptionInput,aPriceInput);
				amenityList.add(amenity);
				
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
						
						for(int i = 0; i < roomList.size(); i++) {
							
							if((((roomList.get(i))).getRoom_code()).equals(roomInput) ) {
								
								roomCheck = 1;
								break;

							}
																										
						}
						
						if(roomCheck == 1) {
							
							System.out.println("\nThis room code already exists...");
							break;
							
						}					
						
						System.out.println("Enter Floor: ");
						int floorInput = in.nextInt();
						System.out.println("Enter Capacity (1-2-3-4) : ");
						int capacityInput = in.nextInt();
						System.out.println("Enter Price: ");
						double priceInput = in.nextDouble();
						StandardRoom standard_room= new StandardRoom(roomInput,floorInput,capacityInput,priceInput);
						roomList.add(standard_room);
						
						break;
						
						
					case 'b':
						System.out.println("Enter Room Number: ");
						String superior_roomInput = in.next();
						int superior_roomCheck = 0;
						
						for(int i = 0; i < roomList.size(); i++) {
							
							if((((roomList.get(i))).getRoom_code()).equals(superior_roomInput) ) {
								
								superior_roomCheck = 1;
								break;

							}
																										
						}
						
						if(superior_roomCheck == 1) {
							
							System.out.println("\nThis room code already exists...");
							break;
							
						}					
						
						System.out.println("Enter Floor: ");
						int floorInput1 = in.nextInt();
						System.out.println("Enter Capacity (1-2-3-4) : ");
						int capacityInput1 = in.nextInt();
						System.out.println("Enter Price: ");
						double priceInput1 = in.nextDouble();
						System.out.println("Enter Amenities: ");
						String amenitiesInput = in.next();
						SuperiorRoom superior_room = new SuperiorRoom(superior_roomInput,floorInput1,capacityInput1,priceInput1,amenitiesInput);
						roomList.add(superior_room);
						
						break;
					default:
						System.out.println("Undefined argument.");
						break;
				}
				break;
				
				
			case 3:
				System.out.println("Enter client's ID code:");
				String idInput = in.next();
				int idCheck = 0;
				
				for(int i = 0; i < clientList.size(); i++) {
					
					if((((clientList.get(i))).getId()).equals(idInput) ) {
						
						idCheck = 1;
						break;

					}
																								
				}
				
				if(idCheck == 1) {
					
					System.out.println("\nThis client already exists...");
					break;
					
				}					
				
				System.out.println("Enter Client's First_Name: ");
				String first_nameInput = in.next();
				System.out.println("Enter Client's Last_Name: ");
				String last_nameInput = in.next();
				System.out.println("Enter Client's Address: ");
				String addressInput = in.next();
				System.out.println("Enter Client's Telephone: ");
				int telephoneInput = in.nextInt();
				Client client = new Client(idInput, first_nameInput, last_nameInput, addressInput, telephoneInput);
				clientList.add(client);
				
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
