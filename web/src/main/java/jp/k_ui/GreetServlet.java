package jp.k_ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static private Logger LOG = LoggerFactory.getLogger(GreetServlet.class);
	
	public GreetServlet() {
		LOG.debug("constract");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		LOG.debug("greet!!");
		MyLib lib = new MyLib();
		res.getWriter().append("<p>").append(lib.greet()).close();
	}
}
