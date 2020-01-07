package com.iinnoinc.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iinnoinc.board.vo.BoardVO;

@Mapper
public interface BoardDAO {

	public List<BoardVO> boardLst(BoardVO _boardVO); 
	

	public BoardVO boardSel(BoardVO _boardVO); 

	public int boardIns(BoardVO _boardVO); 

	public int boardUpd(BoardVO _boardVO);

	public int boardDel(BoardVO _boardVO);

	public int boardRegdate (BoardVO _boardVO); //조회수
	
	public int totalCount(BoardVO _boardVO);
	
}

