package com.iinnoinc.userinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iinnoinc.userinfo.vo.UserinfoVO;


@Mapper
public interface UserinfoDAO {

	public List<UserinfoVO> userinfoLst(UserinfoVO _userinfoVO);

	public UserinfoVO userinfoSel(UserinfoVO _userinfoVO);

	public int userinfoIns(UserinfoVO _userinfoVO);

	public int userinfoUpd(UserinfoVO _userinfoVO);

	public int userinfoDel(UserinfoVO _userVO);

}
