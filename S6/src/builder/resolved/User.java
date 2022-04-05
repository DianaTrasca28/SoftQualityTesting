package builder.resolved;

public class User {
	//mandatory
	String username;
	String password;
	String email;
	
	//optional
	String address;
	String phoneNo;
	String birthday;
	public User(Userbuilder ub) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
		this.birthday = birthday;
	}
	public static class Userbuilder{
		//mandatory
		String username;
		String password;
		String email;
		
		//optional
		String address;
		String phoneNo;
		String birthday;
		
		Userbuilder(String username, String password, String email){
			this.username=username;
			this.password=password;
			this.email=email;
		}
		Userbuilder address(String address) {
			this.address=address;
			return this;
		}
		Userbuilder phoneNo(String phoneNo) {
			this.phoneNo=phoneNo;
			return this;
		}
		Userbuilder birthday(String birthday) {
			this.birthday=birthday;
			return this;
		}
		public User build() {
			User user=new User(this);
			return user;
		}
	}
}
