package cn.com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = -8977500394109593730L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!get!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		PrintWriter pWriter = resp.getWriter();
		pWriter.print("asdfasdf");
	}

	@Override
	public void destroy() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!destroy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!init!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getInitParameter("");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!initConfig!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		super.init(config);
	}

}
