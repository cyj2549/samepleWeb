package com.iinnoinc.userinfo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.iinnoinc.userinfo.service.UserinfoService;
import com.iinnoinc.userinfo.vo.UserinfoVO;

@Controller
public class UserinfoController {

	@Autowired
	private UserinfoService userinfoService;

	// 목록
	@GetMapping("/userinfo/lst.do")
	public String lst(UserinfoVO _userinfoVO, ModelMap _model) {
		
		List<UserinfoVO> userinfoLst = userinfoService.userinfoLst(_userinfoVO);
		_model.addAttribute("userinfoLst",	userinfoLst);
		
		return "userinfo.lst";
	}
	
	// 상세
	@GetMapping("/userinfo/sel.do")
	public String sel(UserinfoVO _userinfoVO, ModelMap _model) {

		UserinfoVO userinfoSel = userinfoService.userinfoSel(_userinfoVO);
		_model.addAttribute("userinfoSel",	userinfoSel);
		
		return "userinfo.sel";
	}
	
	// 등록
	@GetMapping("/userinfo/ins.do")
	public String ins(UserinfoVO _userinfoVO, ModelMap _model) {
		return "userinfo.ins";
	}
	
	// 수정
	@GetMapping("/userinfo/upd.do")
	public String upd(UserinfoVO _userinfoVO, ModelMap _model) {

		UserinfoVO userinfoSel = userinfoService.userinfoSel(_userinfoVO);
		_model.addAttribute("userinfoSel",	userinfoSel);
		
		System.out.println("userinfoVO"+ _userinfoVO);
		System.out.println("=으으으ㅡ으으으=================================");
		
		System.out.println( _userinfoVO.getTitle());
		System.out.println( _userinfoVO.getContent());

		return "userinfo.upd";
	}
	
	// 삭제
	@GetMapping("/userinfo/del.do")
	public String del(UserinfoVO _userinfoVO, ModelMap _model) {
		
		userinfoService.userinfoDel(_userinfoVO);
		
		return "redirect:/userinfo/lst.do";
	}

	
	
	
	@PostMapping("/userinfo/ins.do")
	public String postIns(UserinfoVO _userinfoVO, ModelMap _model) {
		userinfoService.userinfoIns(_userinfoVO);
		return "redirect:/userinfo/lst.do";
	}
	
	@PostMapping("/userinfo/upd.do")
	public String postUpd(UserinfoVO _userinfoVO, ModelMap _model) {
		userinfoService.userinfoUpd(_userinfoVO);
		
		
		System.out.println("@@@@@@@@@@@@========================");
		System.out.println( _userinfoVO.getNum());
		System.out.println( _userinfoVO.getTitle());
		System.out.println( _userinfoVO.getContent());

		
		return "redirect:/userinfo/sel.do?num="+_userinfoVO.getNum();
	}
	

}
