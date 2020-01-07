package com.iinnoinc.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iinnoinc.board.dao.BoardDAO;
import com.iinnoinc.board.vo.BoardVO;
import com.iinnoinc.board.service.BoardService;


@Service
public class BoardServiceImpl implements BoardService {
	

	
	@Autowired
	private BoardDAO boardAO;
	
	@Override
	public List<BoardVO> boardLst(BoardVO _boardVO){
		return boardAO.boardLst(_boardVO);
	}
	
	@Override
	public BoardVO boardSel(BoardVO _boardVO){
		return boardAO.boardSel(_boardVO);
	}
	
	@Override
	public int boardIns(BoardVO _boardVO){
		return boardAO.boardIns(_boardVO);
	}
	
	@Override
	public int boardUpd(BoardVO _boardVO){
		return boardAO.boardUpd(_boardVO);
	}
	
	@Override
	public int boardDel(BoardVO _boardVO){
		return boardAO.boardDel(_boardVO);
	}
	
	
	@Override
	public int boardRegdate(BoardVO _boardVO) {
		return boardAO.boardRegdate(_boardVO); //조회수
		
	}

	@Override
	public int totalCount(BoardVO _boardVO) {
		
		return boardAO.totalCount(_boardVO);
	}





}
