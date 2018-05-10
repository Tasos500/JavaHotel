
public class SuperiorRoom extends Room{
	
	private String amenities;

	SuperiorRoom(String room_code, int floor, int capacity, double price, String amenities) {
		super(room_code, floor, capacity, price);
		this.setAmenities(amenities);
	}
	
	
		public void setAmenities(String amenities) {
		
			this.amenities = amenities;
		}
	
		public String getAmenities() {
		
			return amenities;
		}
	
}
