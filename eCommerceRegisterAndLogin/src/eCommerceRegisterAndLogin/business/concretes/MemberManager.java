package eCommerceRegisterAndLogin.business.concretes;

import eCommerceRegisterAndLogin.business.abstracts.LoginRulesService;
import eCommerceRegisterAndLogin.business.abstracts.MemberService;
import eCommerceRegisterAndLogin.business.abstracts.RegisterRulesService;
import eCommerceRegisterAndLogin.dataAccess.abstracts.MemberDaoService;
import eCommerceRegisterAndLogin.entities.concretes.Member;

public class MemberManager implements MemberService {
	
	private RegisterRulesService registerRulesService;
	private LoginRulesService loginRulesService;
	private MemberDaoService memberDaoService;
	
	public MemberManager(RegisterRulesService registerRulesService, MemberDaoService memberDaoService,LoginRulesService loginRulesService) {
		this.registerRulesService=registerRulesService;
		this.memberDaoService=memberDaoService;
		this.loginRulesService=loginRulesService;
	}
	
	@Override
	public void add(Member member) {
		if(registerRulesService.registerRules(member)&&(!(member==null))) {
			memberDaoService.add(member);
			System.out.println(member.getFirstName()+" "+member.getLastName()+" registered, but you need to complete last step. Check your mailbox and verify your account. ");
			sendEmail(member);
		}
		else {
			System.out.println("Member can not be register. Please check your informations: "+member.getFirstName());
		}
		
	}

	@Override
	public void login(String email,String password) {
		
		if(loginRulesService.loginRule(email,password)) {
			System.out.println("Welcome!");
		}else {
			System.out.println("Wrong e-mail and password.");
		}
		
		
	}
	
	public void sendEmail(Member member) {
		System.out.println("Verification mail has been sent.");
	}
	
	public void verificationAccount(Member member) {
		
		member.setVerification(true);
		System.out.println("Congratulations! Your account has verified.");
	}
}
