package com.iinnoinc.memo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iinnoinc.memo.vo.MemoVO;


@Mapper
public interface MemoDAO {

	public List<MemoVO> memoLst(MemoVO _memoVO);

	public MemoVO memoSel(MemoVO _memoVO);

	public int memoIns(MemoVO _memoVO);

	public int memoUpd(MemoVO _memoVO);

	public int memoDel(MemoVO _memoVO);
	
}