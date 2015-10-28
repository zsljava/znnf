package cn.znnf.util;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionTimeoutInterceptor extends HandlerInterceptorAdapter {

	private List<String> allowUrls;

	public List<String> getAllowUrls() {
		return allowUrls;
	}

	public void setAllowUrls(List<String> allowUrls) {
		this.allowUrls = allowUrls;
	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String requestUrl = request.getRequestURI();
		for (String url : allowUrls) {
			if (requestUrl.endsWith(url)) {
				return true;
			}
		}
		if (request.getSession().getAttribute("loginUser") == null) {
			PrintWriter out = response.getWriter();
			StringBuilder builder = new StringBuilder();
			builder.append("<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
			builder.append("<script type=\"text/javascript\">");
			builder.append("alert(\"页面过期，请重新登录\");");
			builder.append("window.top.location.href=\"");
			builder.append(request.getContextPath());
			builder.append("\";</script></html>");
			out.print(builder.toString());
			out.close();
			return false;
		} else {
			return true;
		}
	}
}
