package com.iinnoinc.userinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iinnoinc.userinfo.dao.UserinfoDAO;
import com.iinnoinc.userinfo.service.UserinfoService;
import com.iinnoinc.userinfo.vo.UserinfoVO;



@Service
public class UserinfoServicelmpl implements UserinfoService {
	@Autowired
	private UserinfoDAO userinfoAO;
	
	@Override
	public List<UserinfoVO> userinfoLst(UserinfoVO _userinfoVO) {
		return userinfoAO.userinfoLst(_userinfoVO);
	}

	@Override
	public UserinfoVO userinfoSel(UserinfoVO _userinfoVO) {
		return userinfoAO.userinfoSel(_userinfoVO);
	}

	@Override
	public int userinfoIns(UserinfoVO _userinfoVO) {
		return userinfoAO.userinfoIns(_userinfoVO);
	}

	@Override
	public int userinfoUpd(UserinfoVO _userinfoVO) {
		return userinfoAO.userinfoUpd(_userinfoVO);
	}

	@Override
	public int userinfoDel(UserinfoVO _userinfoVO) {
		return userinfoAO.userinfoDel(_userinfoVO);
	}

}
