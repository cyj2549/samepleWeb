package com.iinnoinc.board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.iinnoinc.board.vo.BoardVO;

@Transactional
public interface BoardService {
	
	List<BoardVO> boardLst(BoardVO _boardVO);

	BoardVO boardSel(BoardVO _boardVO);

	int boardIns(BoardVO _boardVO);

	int boardUpd(BoardVO _boardVO);

	int boardDel(BoardVO _boardVO);
	
	int boardRegdate (BoardVO _boardVO); //조회수

	int totalCount(BoardVO _boardVO);
}
