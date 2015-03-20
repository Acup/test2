package cn.com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("==========================================get===========================================");
		super.doGet(req, resp);
	}

	@Override
	public void destroy() {
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("==========================================init==========================================");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getInitParameter("");
		super.init(config);
	}

}
