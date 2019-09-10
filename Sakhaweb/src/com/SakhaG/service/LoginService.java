package com.SakhaG.service;

import com.SakhaG.dao.Userdao;

public class LoginService {
public boolean validateLogin(String username,String password) throws Exception{
	Userdao dao=new Userdao();
	return dao.getData(username, password);	
}
}
