package eCommerceRegisterAndLogin.dataAccess.abstracts;

import java.util.List;

import eCommerceRegisterAndLogin.entities.concretes.Member;

public interface MemberDaoService {
	void add(Member member);
	List<Member> getAll();
}
