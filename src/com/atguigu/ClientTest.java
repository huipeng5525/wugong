package com.atguigu;

import com.atguigu.service.PhoneCheck;
import com.atguigu.service.PhoneCheckImplService;

public class ClientTest {
	public static void main(String[] args) {
		PhoneCheck phoneCheck = new PhoneCheckImplService().getPhoneCheckImplPort();
		String checkAreaByPhoneNum = phoneCheck.checkAreaByPhoneNum("1111235649");
		System.out.println(checkAreaByPhoneNum);
		
		
	}

}
