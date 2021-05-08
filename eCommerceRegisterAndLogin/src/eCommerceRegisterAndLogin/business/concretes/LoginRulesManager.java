package eCommerceRegisterAndLogin.business.concretes;

import java.util.List;

import eCommerceRegisterAndLogin.business.abstracts.LoginRulesService;
import eCommerceRegisterAndLogin.dataAccess.abstracts.MemberDaoService;
import eCommerceRegisterAndLogin.entities.concretes.Member;

public class LoginRulesManager implements LoginRulesService {
	
	private MemberDaoService memberDao;
	
	public LoginRulesManager(MemberDaoService memberDao) {
		this.memberDao=memberDao;
	}
	
	
	@Override
	public boolean loginRule(String email, String password) {
		List<Member> members=memberDao.getAll();
		for(Member member1: members) {
			if(member1.geteMail().equals(email)&&member1.getPassword().equals(password)&&loginVerificationRule(member1)) {
				return true;
			}
		}
		return false;
		
	}
	public boolean loginVerificationRule(Member member) {
		if(member.isVerification()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
