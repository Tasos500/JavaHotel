
public class Reservation {
	
	private int room_number;
	private int occupants;
	private String client_name;
	private String check_in;
	private String check_out;
	private String amenities;
	private double discount;
	private double payout;

	Reservation(int room_number, int occupants, String client_name, String check_in, String check_out, double discount, double payout){
		this.setRoom_number(room_number);
		this.setOccupants(occupants);
		this.setCheck_in(check_in);
		this.setCheck_out(check_out);
		this.setClient_name(client_name);
		this.setDiscount(discount);
		this.setPayout(payout);
	}
	
		public void setRoom_number(int room_number) {
		
			this.room_number = room_number;
		}
	
		public int getRoom_number() {
		
			return room_number;
		}
	
	
		public void setOccupants(int occupants) {
			
			this.occupants = occupants;
		}
		
		public int getOccupants() {
			
			return occupants;
		}
		
	
		public void setClient_name(String client_name){
			
			this.client_name = client_name;	
		}
		
		public String getClient_name() {
			
			return client_name;
		}
		
			
		public void setCheck_in(String check_in){
				
				this.check_in = check_in;	
		}
			
		public String getCheck_in() {
				
			return check_in;
		}
	
	
		public void setCheck_out(String check_out){
			
			this.check_out = check_out;	
		}
		
		public String getCheck_out() {
			
			return check_out;
		}

		
		public void setAmenities(String amenities){
			
			this.amenities = amenities;	
		}
		
		public String getAmenities(){
			
			return amenities;
		}
	
	
		public void setDiscount(double discount) {
			
			this.discount = discount;
		}
		
		public double getDiscount() {
			
			return discount;
		}
	
	
		public void setPayout(double payout) {
			
			this.payout = payout;
		}
		
		public double getPayout() {
			
			return payout;
		}
	
	
}
