package eCommerceRegisterAndLogin;


import java.util.List;

import eCommerceRegisterAndLogin.business.concretes.LoginRulesManager;
import eCommerceRegisterAndLogin.business.concretes.MemberManager;
import eCommerceRegisterAndLogin.business.concretes.RegisterRulesManager;
import eCommerceRegisterAndLogin.core.GoogleMemberAdapter;
import eCommerceRegisterAndLogin.core.MemberAdapter;
import eCommerceRegisterAndLogin.dataAccess.abstracts.MemberDaoService;
import eCommerceRegisterAndLogin.dataAccess.concretes.MemberDao;
import eCommerceRegisterAndLogin.entities.concretes.Member;


public class Main {

	public static void main(String[] args) {
		Member member1=new Member(1,"Ömer","Ergin","omerergin@gmail.com","123456");
		Member member2=new Member(2,"Ergin","Ömer","erginomer@gmail.com","654321");
		MemberDaoService memberDao=new MemberDao();
		MemberManager memberManager1=new MemberManager(new RegisterRulesManager(memberDao),memberDao,new LoginRulesManager(memberDao)); 
		MemberManager memberManager2=new MemberManager(new RegisterRulesManager(memberDao),memberDao,new LoginRulesManager(memberDao));
		memberManager1.add(member1);
		memberManager1.add(member2);
		
		MemberAdapter googleAdapter=new GoogleMemberAdapter();
		Member googleMember=googleAdapter.getMember("google1@gmail.com", "12345678");
		memberManager1.add(googleMember);
		
		memberManager1.verificationAccount(googleMember);
		memberManager1.verificationAccount(member1);
		memberManager1.verificationAccount(member2);
		
		memberManager1.login("omerergin@gmail.com", "123456");		
		memberManager2.login("erginomer@gmail.com", "654321");
		memberManager2.login("google1@gmail.com", "12345678");
		
		List<Member> members=memberDao.getAll();
		
		for(Member member : members) {
			System.out.println(member.getLastName());
		}
		
	}

}
