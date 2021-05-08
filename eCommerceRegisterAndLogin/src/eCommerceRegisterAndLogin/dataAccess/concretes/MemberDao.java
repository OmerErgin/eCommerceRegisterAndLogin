package eCommerceRegisterAndLogin.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceRegisterAndLogin.dataAccess.abstracts.MemberDaoService;
import eCommerceRegisterAndLogin.entities.concretes.Member;

public class MemberDao implements MemberDaoService {
	static List<Member> members = new ArrayList<Member>();
	
	public void add(Member member) {
		members.add(member);
	}
	public List<Member> getAll(){
		return members;
	}
	
}