package popup.controller;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import popup.dto.Picture;
import popup.service.MemberService;
import popup.service.OpenStoreService;
import popup.service.ReplyService;
import popup.vo.ReplyVo;
import popup.service.PictureService;
import popup.vo.StoreVo;

@Controller
public class MapController {
	
	@Autowired
	OpenStoreService openStoreService;
	
	@Autowired
	ReplyService replyService;
  
	@Autowired
	PictureService pictureService;
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/map")
	public String getMap(Model model, HttpSession session) {
		
		List<StoreVo> openStoreList = openStoreService.getAllStore();
		List<ReplyVo> getReplyList = replyService.getReplyList();
		List<String> location = Arrays.asList("전체","서울", "경기","인천","강원","제주","부산","경남","대구","경북","울산","대전","충남","충북","광주","전남","전북");
		try {
			List<String> getBussinessMember = memberService.getBussinessMember();
			
			model.addAttribute("openStoreList", openStoreList);
			model.addAttribute("getReplyList", getReplyList);
			model.addAttribute("getBussinessMember", getBussinessMember);
			model.addAttribute("location", location);
			model.addAttribute("filterStoreList", openStoreList);
			
		} catch (SQLException e) {
			model.addAttribute("openStoreList", openStoreList);
			model.addAttribute("getReplyList", getReplyList);
			model.addAttribute("location", location);
			model.addAttribute("filterStoreList", openStoreList);
		}


		
		return "map";
	}
	
	
}
