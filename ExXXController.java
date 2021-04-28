package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//このクラスを呼び出す
@Controller
@RequestMapping("/receive")
public class ExXXController {
	
	//ログイン画面を出す（自動的に）
	@RequestMapping("")
	public String index() {
		return "ex-XX";
	}
	
	//合ってれば成功出す
	//それ以外は失敗出す
	@RequestMapping("/receive-info")
	public String receiveInfo(String adress,String password) {
		if(adress.equals("abc@gmail.com") && password.equals("abc")){
			System.out.println(adress);
			System.out.println(password);
			return "ex-XX-success";
		}else {
			return "ex-XX-failure";
		}
	}
	

}
