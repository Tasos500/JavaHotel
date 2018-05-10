
public class Room {

	private String room_code;
	private int floor;
	private int capacity;
	private double price;
	
	
	Room (String room_code, int floor, int capacity, double price){
	this.setRoom_code(room_code);
	this.setFloor(floor);
	this.setCapacity(capacity);
	this.setPrice(price);
	}
	
	
		public void setRoom_code(String room_code){
		
			this.room_code = room_code;	
		}
	
		public String getRoom_code() {
		
			return room_code;
		}
	
	
		public void setFloor(int floor) {
		
			this.floor = floor;
		}
	
		public int getFloor() {
		
			return floor;
		}
	
	
		public void setCapacity(int capacity) {
		
			this.capacity = capacity;
		}
	
		public int getCapacity() {
		
			return capacity;
		}
	
	
		public void setPrice(double price) {
		
			this.price = price;
		}
	
		public double getPrice() {
		
			return price;
		}
	
}
