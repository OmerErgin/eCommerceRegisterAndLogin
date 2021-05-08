package eCommerceRegisterAndLogin.business.abstracts;

import eCommerceRegisterAndLogin.entities.concretes.Member;

public interface LoginRulesService {
	boolean loginRule(String email, String password);
	boolean loginVerificationRule(Member member);
}
