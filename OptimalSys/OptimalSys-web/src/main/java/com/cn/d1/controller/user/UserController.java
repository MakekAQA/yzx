/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: UserController.java 
 * @Prject: OptimalSys-web
 * @Package: com.cn.d1.controller.user 
 * @Description: TODO
 * @author: yzx   
 * @date: 2017年10月26日 上午9:32:21 
 * @version: V1.0   
 */
package com.cn.d1.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.d1.entity.user.User;
import com.cn.d1.service.user.UserService;

import org.springframework.ui.Model;

/** 
 * @ClassName: UserController 
 * @Description: TODO
 * @author: yzx
 * @date: 2017年10月26日 上午9:32:21  
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("add.html")
	public String addUser(Model model,User user){
		if (user==null) {
			return "addUser";
		}else {
			Integer result = userService.addUser(user);
			if (result > 0) {
				model.addAttribute("msg", "恭喜,添加成功~");
				return "forward:/user/login.jhtml";
			} else {
				model.addAttribute("msg", "对不起,添加失败~~");
				return "addUser";
			}
		}
	}
}
