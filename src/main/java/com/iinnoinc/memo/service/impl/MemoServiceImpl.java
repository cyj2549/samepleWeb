package com.iinnoinc.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iinnoinc.memo.dao.MemoDAO;
import com.iinnoinc.memo.service.MemoService;
import com.iinnoinc.memo.vo.MemoVO;

@Service
public class MemoServiceImpl implements MemoService{

	@Autowired
	private MemoDAO memoAO;
	
	@Override
	public List<MemoVO> memoLst(MemoVO _memoVO){
		return memoAO.memoLst(_memoVO);
	}
	
	@Override
	public MemoVO memoSel(MemoVO _memoVO){
		return memoAO.memoSel(_memoVO);
	}
	
	@Override
	public int memoIns(MemoVO _memoVO){
		return memoAO.memoIns(_memoVO);
	}
	
	@Override
	public int memoUpd(MemoVO _memoVO){
		return memoAO.memoUpd(_memoVO);
	}
	
	@Override
	public int memoDel(MemoVO _memoVO){
		return memoAO.memoDel(_memoVO);
	}
	
}
