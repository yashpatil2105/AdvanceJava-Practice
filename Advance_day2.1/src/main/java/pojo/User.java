package pojo;

public class User {
	
	private int userID;
	private String custName;
	private String city;
	private String email;
	private String password;
	
	public User(int userID, String custName, String city, String email, String password) {
		super();
		this.userID = userID;
		this.custName = custName;
		this.city = city;
		this.email = email;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	@Override
	public String toString() {
		return "User [userID=" + userID + ", custName=" + custName + ", city=" + city + ", email=" + email
				+ ", password=" + password + "]";
	}

}
