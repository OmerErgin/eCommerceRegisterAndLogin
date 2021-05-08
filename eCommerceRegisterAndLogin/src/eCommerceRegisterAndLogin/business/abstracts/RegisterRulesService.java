package eCommerceRegisterAndLogin.business.abstracts;

import eCommerceRegisterAndLogin.entities.concretes.Member;

public interface RegisterRulesService {
	boolean registerRules(Member member);
	boolean checkPassword(Member member);
	boolean checkEMail(Member member);
	boolean checkFirstName(Member member);
	boolean checkLastName(Member member);
	boolean eMailFormat(Member member);
}
