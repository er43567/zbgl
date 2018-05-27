package cn.zbgl.lrx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.zbgl.lrx.dao.LrxDao;
import cn.zbgl.lrx.service.LrxService;

@Service("lrxService")
@Transactional
public class LrxServiceImpl implements LrxService {
	@Autowired
	LrxDao dao;
	
	@Override
	public void testService() {
		System.out.println("Service层被调用, lrxDao = " + dao);
		dao.testDao();
	}

}
