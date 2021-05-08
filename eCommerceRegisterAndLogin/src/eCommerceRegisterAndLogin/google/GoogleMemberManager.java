package eCommerceRegisterAndLogin.google;

import java.util.ArrayList;
import java.util.List;
public class GoogleMemberManager {

	List<GoogleMember> googleMembers=new ArrayList<GoogleMember>();

	public GoogleMemberManager() {
			
		googleMembers.add(new GoogleMember(30,"Google1","Google1","google1@gmail.com","12345678","Things"));
		googleMembers.add(new GoogleMember(40,"Google2","Google2","google2@gmail.com","2152515155","Things"));
		googleMembers.add(new GoogleMember(50,"Google3","Google3","google3@gmail.com","9182qweq7364","Things"));
	}



	public GoogleMember sendGoogleMember(String email,String password) {
		for (GoogleMember googleMember: googleMembers) {
			if((email==googleMember.geteMail())&&(password==googleMember.getPassword()))
					{
					return googleMember;
					}
		}
		return null;
	}
}
