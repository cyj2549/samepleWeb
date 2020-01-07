package com.iinnoinc.memo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.iinnoinc.memo.vo.MemoVO;

@Transactional
public interface MemoService {

	List<MemoVO> memoLst(MemoVO _memoVO);

	MemoVO memoSel(MemoVO _memoVO);

	int memoIns(MemoVO _memoVO);

	int memoUpd(MemoVO _memoVO);

	int memoDel(MemoVO _memoVO);

}
