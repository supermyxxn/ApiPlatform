package com.apinews.core.server.action;

import java.util.List;

import com.apinews.core.server.service.MyService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class TestAction implements Action {

	private MyService ms;
	
	private List<Object> booksList;
	
	public List<Object> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Object> booksList) {
		this.booksList = booksList;
	}

	public MyService getMs() {
		return ms;
	}

	public void setMs(MyService ms) {
		this.ms = ms;
	}

	public String execute() throws Exception {
		List<Object> objList = ms.validate("", "");
		setBooksList(objList);
		return SUCCESS;
	}

}
