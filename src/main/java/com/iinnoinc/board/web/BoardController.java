package com.iinnoinc.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iinnoinc.board.service.BoardService;
import com.iinnoinc.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	// 목록
	@GetMapping("/board/lst.do")
	public String lst(BoardVO _boardVO, ModelMap _model ) {
		boardService.boardRegdate(_boardVO); // 조회수
		
        int totalCount= boardService.totalCount(_boardVO); //총 게시물 수 
		_model.addAttribute("totalCount",totalCount);
		
		
		_model.addAttribute("end", Math.ceil((double)totalCount / _boardVO.getCountList()));
		
		System.out.println("===============end=============");
		System.out.println(Math.ceil( totalCount / _boardVO.getCountList()));
		System.out.println(Math.ceil( (double)totalCount / _boardVO.getCountList()));
		//Math.ceil 올림 함수
		
		List<BoardVO> boardLst = boardService.boardLst(_boardVO);
		_model.addAttribute("boardLst", boardLst);
		// System.out.println("board" + _boardVO);
		// System.out.println(_boardVO.getCdKey());

		System.out.println("=====검색 기능=====");
		System.out.println(_boardVO.getSearchType());
		System.out.println(_boardVO.getKeyword());
		System.out.println(_boardVO.toSting());

		return "board.lst";
				
//		return "board/lst.do?page=1&countList=10";
//		return "redirect:/board/lst.do?page=" + _boardVO.getPage() + "&countList=" _boardVO.getCountList();
//		return "/board/lst.do?page=" + _boardVO.getPage() + "&countList=" _boardVO.getCountList();
//		return "redirect:/board/lst.do?page=" + _boardVO.getPage();
		
	}

//	  @RequestMapping
//	    public void search(int boardId, ModelMap model){
//	        model.addAttribute("param", new PostSearchParam());
//	        model.addAttribute(boardService.getById(boardId));
//	    }

	// 상세
	@GetMapping("/board/sel.do")
	public String sel(BoardVO _boardVO, ModelMap _model) {
		boardService.boardRegdate(_boardVO); // 조회수 //게시글 조횟수 늘리기가 선행되어야 한다.

		BoardVO boardSel = boardService.boardSel(_boardVO);

		_model.addAttribute("boardSel", boardSel);

/////////////////////////////////////////////////////////////////////////////
//		int countCheck = 0;
//
//		Cookie[] cookies = req.getCookies();
//		  if (cookies != null) {
//		   for (int i = 0; i < cookies.length; i++) {
//		    if(cookies[i].getName().equals("bbsSeq"+bbs.getBbsSeq())){
//		     countCheck = 0;
//		     break;
//		    }else{
//		     Cookie cookie = new Cookie("bbsSeq"+bbs.getBbsSeq(), String.valueOf(bbs.getBbsSeq()));
//		     cookie.setMaxAge(60*60*24);
//		     cookie.setPath("/");
//		     res.addCookie(cookie);
//
//		     countCheck += 1;
//		    }
//		   }
//		  }
//
//		  //상세정보 조회시 카운트 증가
//		  if(countCheck > 0){
//		   bbsService.updateBbsViewCount(bbs);
//		  }
////////////////////////////////////////////////////////////////////////////////

		
		return "board.sel";

	}

	// 등록
	@GetMapping("/board/ins.do")
	public String ins(BoardVO _boardVO, ModelMap _model) {
		System.out.println("======등록======");
		System.out.println(_boardVO.getTitle());
		System.out.println(_boardVO.getDetail());
		return "board.ins";
	}

	// 수정
	@GetMapping("/board/upd.do")
	public String upd(BoardVO _boardVO, ModelMap _model) {

		BoardVO boardSel = boardService.boardSel(_boardVO);
		_model.addAttribute("boardSel", boardSel);

		return "board.upd";
	}

	// 삭제
	@GetMapping("/board/del.do")
	public String del(BoardVO _boardVO, ModelMap _model) {
		boardService.boardDel(_boardVO);
		return "redirect:/board/lst.do";
	}

	@PostMapping("/board/ins.do")
	public String postIns(BoardVO _boardVO, ModelMap _model) {

		if (_boardVO.getTitle().equals("")) {
			_boardVO.setTitle(null);
		}

		if (_boardVO.getUserNm().equals("")) {
			_boardVO.setUserNm(null);
		}

		if (_boardVO.getDetail().equals("")) {
			_boardVO.setDetail(null);
		}
		// string null 값으로 들어오지 않아서 db에서 validation check 불가
		// string null 값으로 들어왔을 경우 db validation 처리를 위해 set 인스턴트 메서드를 사용하여 강제 null 셋팅
		boardService.boardIns(_boardVO);
		System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
		System.out.println(_boardVO.getUserNm() + " 작성자");
		System.out.println(_boardVO.getTitle() + " 제목");
		System.out.println(_boardVO.getDetail() + " 내용");

		return "redirect:/board/lst.do";
	}

	@PostMapping("/board/upd.do")
	public String postUpd(BoardVO _boardVO, ModelMap _model) {
		boardService.boardUpd(_boardVO);
		return "redirect:/board/sel.do?cdKey=" + _boardVO.getCdKey();
	}

}
