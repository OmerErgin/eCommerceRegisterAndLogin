package eCommerceRegisterAndLogin.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceRegisterAndLogin.business.abstracts.RegisterRulesService;
import eCommerceRegisterAndLogin.dataAccess.abstracts.MemberDaoService;
import eCommerceRegisterAndLogin.entities.concretes.Member;

public class RegisterRulesManager implements RegisterRulesService {
	
	private MemberDaoService memberDao;
	
	public RegisterRulesManager(MemberDaoService memberDao) {
		this.memberDao=memberDao;
	}
	
	@Override
	public boolean checkPassword(Member member) {
		if(member.getPassword().length()<6) {
			System.out.println("Password must be at least 6 characters.");
			return false;
		}
		else {
			return true;
		}
		
	}
	@Override
	public boolean checkEMail(Member member) {
		List<Member> members=memberDao.getAll();
		for (Member member1: members) {
			if (member1.geteMail()==member.geteMail()) {
				System.out.println("Email already exists.");
				return false;
			}
			}
		return true;
	}
	
	@Override
	public boolean checkFirstName(Member member) {
		if(member.getFirstName().length()<2) {
			System.out.println("First Name must be at least 2 characters.");
			return false;
		}
		else {
			return true;
		}
		
	}
	
	@Override
	public boolean checkLastName(Member member) {
		if(member.getLastName().length()<2) {
			System.out.println("Last Name must be at least 2 characters.");
			return false;
		}else {
			return true;
		}
		
	}
	@Override
	public boolean registerRules(Member member) {
		if(checkFirstName(member)&&checkLastName(member)&&checkPassword(member)&&checkEMail(member)&&eMailFormat(member))
		{
			return true;
		}
		else {
			System.out.println("Check email.");
			return false;
		}
	}
	
	@Override
	public boolean eMailFormat(Member member) {
		Pattern pattern =Pattern.compile("^([a-zA-Z0-9+_.-])+@([a-zA-Z0-9-]+).([a-z]{2,20})(.[a-z]{2,20})?$");
		Matcher matcher=pattern.matcher(member.geteMail());
		if(matcher.matches()) {
		return true;}
		else {
			return false;
		}
	}
	
	
	
}
