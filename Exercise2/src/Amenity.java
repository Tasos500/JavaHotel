
public class Amenity {
	
	private String code;
	private String category;
	private String description;
	private double aPrice;
	
	Amenity (String code, String category, String description, double aPrice)
	{
		this.setCode(code);
		this.setCategory(category);
		this.setDescription(description);
		this.setAPrice(aPrice);
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setAPrice(double aPrice)
	{
		this.aPrice = aPrice;
	}
	
	public double getAPrice()
	{
		return aPrice;
	}
}
