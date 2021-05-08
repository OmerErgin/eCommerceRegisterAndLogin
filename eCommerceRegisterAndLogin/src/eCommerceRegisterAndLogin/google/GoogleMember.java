package eCommerceRegisterAndLogin.google;

public class GoogleMember {
	private int googleId;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	private String specialGoogleThings;
	
	public GoogleMember(int googleId, String firstName, String lastName, String eMail, String password,
			String specialGoogleThings) {
		
		this.googleId = googleId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.specialGoogleThings = specialGoogleThings;
	}

	public int getGoogleId() {
		return googleId;
	}
	public void setGoogleId(int googleId) {
		this.googleId = googleId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecialGoogleThings() {
		return specialGoogleThings;
	}
	public void setSpecialGoogleThings(String specialGoogleThings) {
		this.specialGoogleThings = specialGoogleThings;
	}
	
}
