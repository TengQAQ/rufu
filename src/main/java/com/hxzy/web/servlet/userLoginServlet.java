package com.hxzy.web.servlet;

import com.hxzy.service.Impl.RoleServiceImpl;
import com.hxzy.service.RoleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/api/login")
public class userLoginServlet extends HttpServlet {
	private final RoleService service = new RoleServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		UserLoginDto dto = new RequestUtil(req, UserLoginDto.class);
////		 获取访问当前servlet的ip地址
//		String loginIp = req.getRemoteAddr();
//		dto.setLoginIp(loginIp);
//
//		Result result = service.login(dto);
//		try(PrintWriter writer = resp.getWriter()){
//			writer.write(JSONObject.toJSONString(result));
//			writer.flush();
//		}
	}
}