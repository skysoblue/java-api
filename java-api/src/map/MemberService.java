package map;

public interface MemberService {
	// 회원가입
	public void join(String id, String pass, String name, String age, String addr);
	// 로그인
	public String login(String id, String pass);
	// 총회원수
	public int count();
	// 아이디 검색
	public Member searchById(String id);
	// 비번 변경
	public String changePass(String id, String pass);
	// 회원 탈퇴
	public String remove(String id);
}
