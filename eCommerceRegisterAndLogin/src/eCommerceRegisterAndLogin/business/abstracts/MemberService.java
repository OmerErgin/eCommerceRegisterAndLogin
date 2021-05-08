package eCommerceRegisterAndLogin.business.abstracts;

import eCommerceRegisterAndLogin.entities.concretes.Member;

public interface MemberService {
	void add(Member member);
	void login(String email,String password);
	void sendEmail(Member member);
}
