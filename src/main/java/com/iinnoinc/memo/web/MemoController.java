package com.iinnoinc.memo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.iinnoinc.memo.service.MemoService;
import com.iinnoinc.memo.vo.MemoVO;



@Controller
public class MemoController {

	@Autowired
	private MemoService memoService;

	// 목록
	@GetMapping("/memo/lst.do")
	public String lst(MemoVO _memoVO, ModelMap _model) {  
		// MemoVO라는건 입력된 Input Data를 꺼내오기 위해 사용이 되는 것이고
		// ModelMap은 실제로 화면상에 정보를 리턴 해주기 위해서 사용이 되는거에요
		
		List<MemoVO> memoLst = memoService.memoLst(_memoVO);
		_model.addAttribute("memoLst",	memoLst);
		
		return "memo.lst";
	}
	
	// 상세
	@GetMapping("/memo/sel.do")
	public String sel(MemoVO _memoVO, ModelMap _model) {

		MemoVO memoSel = memoService.memoSel(_memoVO);
		_model.addAttribute("memoSel",	memoSel);
		
		return "memo.sel";
	}
	
	// 등록
	@GetMapping("/memo/ins.do")
	public String ins(MemoVO _memoVO, ModelMap _model) {
		return "memo.ins";
	}
	
	// 수정
	@GetMapping("/memo/upd.do")
	public String upd(MemoVO _memoVO, ModelMap _model) {

		MemoVO memoSel = memoService.memoSel(_memoVO);
		_model.addAttribute("memoSel",	memoSel);

		return "memo.upd";
	}
	
	// 삭제
	@GetMapping("/memo/del.do")
	public String del(MemoVO _memoVO, ModelMap _model) {
		
		memoService.memoDel(_memoVO);
		
		return "redirect:/memo/lst.do";
	}

	
	
	
	@PostMapping("/memo/ins.do")
	public String postIns(MemoVO _memoVO, ModelMap _model) {
		memoService.memoIns(_memoVO);
		return "redirect:/memo/lst.do";
	}
	
	@PostMapping("/memo/upd.do")
	public String postUpd(MemoVO _memoVO, ModelMap _model) {
		memoService.memoUpd(_memoVO);
		return "redirect:/memo/sel.do?codeKey="+_memoVO.getCodeKey();
	}
	
}
