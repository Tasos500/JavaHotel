
public class Client {
	
	private String  id;
	private String first_name;
	private String last_name;
	private String address;
	private int telephone;

	Client(String id, String first_name, String last_name, String address, int telephone){
		this.setId(id);
		this.setFirst_name(first_name);
		this.setLast_name(last_name);
		this.setAddress(address);
		this.setTelephone(telephone);
	}
	
	
		public void setId(String id){
		
			this.id = id;
		}
	
		public String getId(){
		
			return id;
		}
	
	
		public void setFirst_name(String first_name){
		
			this.first_name = first_name;
		}
	
		public String getFirst_name(){
		
			return first_name;
		}
	
	
		public void setLast_name(String last_name){
		
			this.last_name = last_name;
		}
	
		public String getLast_name(){
		
			return last_name;
		}
	
	
		public void setAddress(String address){
		
			this.address = address;
		}
	
	
		public String getAddress(){
		
			return address;
		}
	
		public void setTelephone(int telephone){
		
			this.telephone = telephone;
		}
	
	
		public int getTelephone(){
		
			return telephone;
		}
	
	
	
	
}
