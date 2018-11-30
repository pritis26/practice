package Streams3;

public class Trader {

	private String name;
	private String city;
	
	public Trader(String name,String city)
	{
		this.name=name;
		this.city=city;
	}

	@Override
	public String toString() {
		return "name= "+name+","
				+ " city=" + city ;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}
	
	
}
