package com.example.traintricketbookingapp.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionInterceptor implements HandlerInterceptor {

	/**
	 * This method is executed before the controller handles the request. It checks
	 * if the user session is still active. If the session has expired or the user
	 * is not logged in, it redirects them to the login page.
	 *
	 * @param request  the HttpServletRequest object
	 * @param response the HttpServletResponse object
	 * @param handler  the handler object
	 * @return true if the user session is active, false otherwise
	 * @throws Exception if an exception occurs during the interception process
	 */
	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler) throws Exception {
		
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("user") == null) {
			response.sendRedirect(request.getContextPath() + "/login?sessionExpired=true");
			return false;
		}
		return true;
	}

	// Implement other methods if needed
}
