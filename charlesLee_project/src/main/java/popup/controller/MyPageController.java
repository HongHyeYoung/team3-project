package popup.controller;


import java.sql.SQLException;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import popup.dto.Member;
import popup.service.MyPageService;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	
	@Autowired
	MyPageService myPageService;
	
	@GetMapping
	public String viewMyPage(Model model,HttpSession session) throws SQLException {
	    // 현재 로그인한 사용자의 정보를 가져옵니다.
	    String memberId = session.getId();
	    Member member = myPageService.getMemberById(memberId);

	    // 사용자가 로그인되어 있지 않은 경우 로그인 페이지로 리디렉션합니다.
//	    if (session.getAttribute("member") == null) {
//	        return "redirect:/login";
//	    }


	    // 모델에 사용자 정보를 추가합니다.
	    model.addAttribute("member", member);

	    return "mypage";
	}
	@PostMapping
	public String modifyMyPage(@ModelAttribute Member modifiedMember, Model model) throws SQLException {
		// 마이페이지 수정 로직을 수행
		myPageService.modifyMember(modifiedMember);
		
		// 수정된 회원 정보를 다시 조회하여 모델에 추가
		String memberId = modifiedMember.getMemberId();
		Member member = myPageService.getMemberById(memberId);
		model.addAttribute("member", member);
		System.out.println("mypage test");
		// 마이페이지로 리디렉션합니다.
		return "mypage";
	}
}





