enum Gender{Male,female};

public class contact {
	
	long phonenumber;
	String Name;
	String Email;
	Gender gen;
	
	public contact(long phno,String name,String email,Gender gen) 
	{
		this.phonenumber=phno;
		this.Name=name;
		this.Email=email;
		this.gen=gen;
		
	}
	
	public long getphno()
	{
		return phonenumber;
	}
	//override
	public String toString()
	{
		return phonenumber+" "+Name+" "+Email+" "+gen;
		
	}
}
