package com.apinews.core.server.service.impl;

import java.util.List;

import com.apinews.core.server.dao.BaseDao;
import com.apinews.core.server.po.Item;
import com.apinews.core.server.service.MyService;

public class MyServiceImpl implements MyService {

	private BaseDao bd;

	public BaseDao getBd() {
		return bd;
	}

	public void setBd(BaseDao bd) {
		this.bd = bd;
	}

	public List<Object> validate(String name, String pass) {
		List<Object> objList = bd.getAll(Item.class);
		return objList;
	}

}
