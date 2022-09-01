package restarraylist;

public class Restaurant {
	String fname;
	int price;
	


	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Restaurant(String fname, int price) {
		super();
		this.fname = fname;
		this.price = price;
	}



	public void display()
	{
		System.out.println(" "+getFname()+"\t"+getPrice());
	}
	
}
