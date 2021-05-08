package eCommerceRegisterAndLogin.core;

import eCommerceRegisterAndLogin.entities.concretes.Member;
import eCommerceRegisterAndLogin.google.GoogleMemberManager;

public class GoogleMemberAdapter implements MemberAdapter {

	
	@Override
	public Member getMember(String email, String password) {
		GoogleMemberManager googleMemberManager=new GoogleMemberManager();
		
		if(!(googleMemberManager.sendGoogleMember(email, password)==null)) {
			
		Member member2= new Member(googleMemberManager.sendGoogleMember(email, password).getGoogleId(),
				googleMemberManager.sendGoogleMember(email, password).getFirstName(),
				googleMemberManager.sendGoogleMember(email, password).getLastName(),
				googleMemberManager.sendGoogleMember(email, password).geteMail(),
				googleMemberManager.sendGoogleMember(email, password).getPassword()
				);
		return member2;
		}
		else {
			return null;
		}
		
		
	}

}
