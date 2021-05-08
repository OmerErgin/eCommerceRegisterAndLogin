package eCommerceRegisterAndLogin.core;

import eCommerceRegisterAndLogin.entities.concretes.Member;

public interface MemberAdapter {
	Member getMember(String email, String password);
}
