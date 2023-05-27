package com.mr.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mr.entity.Users;

public class UsersController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List<Users> listU = UsersService();
		ModelAndView mav = new ModelAndView();//ģ����ͼ����
		mav.addObject("listU",listU);//ģ�ͣ��õ����ݲ������
		mav.setViewName("/WEB-INF/jsp/usersList.jsp");  //��ͼ���������͵����ҳ�������ʾ
		return mav;
	}
	
	//ģ��Service���ڲ���(��Ϊ����û�з������ݿ�Ĵ��룬����ģ��һ�£�
	public List<Users> UsersService(){
		List<Users> list = new ArrayList<>();//һ���б�����ŵ����û���Ķ���
		Users u = new Users();
		u.setName("lilong");
		u.setAge(21);
		u.setTel("1383021**");
		Users u1 = new Users();
		u1.setName("nanchengyu");
		u1.setAge(20);
		u1.setTel("1320125**");
		Users u2 = new Users();
		u2.setName("liuran");
		u2.setAge(19);
		u2.setTel("1366021**");

		Users u3 = new Users();
		u3.setName("�������2��-����");
		u3.setAge(20);
		u3.setTel("2020105150226");
		list.add(u);
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}
}
