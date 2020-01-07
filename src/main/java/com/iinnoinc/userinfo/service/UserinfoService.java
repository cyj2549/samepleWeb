package com.iinnoinc.userinfo.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.iinnoinc.userinfo.vo.UserinfoVO;

@Transactional
public interface UserinfoService {

	List<UserinfoVO> userinfoLst(UserinfoVO _userinfoVO);

	UserinfoVO userinfoSel(UserinfoVO _userinfoVO);

	int userinfoIns(UserinfoVO _userinfoVO);

	int userinfoUpd(UserinfoVO _userinfoVO);

	int userinfoDel(UserinfoVO _userinfoVO);

}
