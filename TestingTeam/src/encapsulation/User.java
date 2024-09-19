package encapsulation;

public class User {
	
	private String name;
	private long phno;
	private String email;
	private String password;
	private String address;
	
	//Getter and Setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		User user=new User();
		user.setName("Sri Charan");
		user.setPhno(7673953956l);
		user.setEmail("sricharan824@gmail.com");
		user.setPassword("qqqqweeeeeeeeeeertyu");
		user.setAddress("Sangareddy");
		
		System.out.println(user.getName());
		System.out.println(user.getPhno());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getAddress());
		System.out.println();
		
		User user2=new User();
		user2.setName("Nani");
		user2.setPhno(7673953956l);
		user2.setEmail("nani@gmail.com");
		user2.setPassword("qqqqweeeeeeeeeeertyu");
		user2.setAddress("Hyderabad");
		
		System.out.println(user2.getName());
		System.out.println(user2.getPhno());
		System.out.println(user2.getEmail());
		System.out.println(user2.getPassword());
		System.out.println(user2.getAddress());
	}
}
