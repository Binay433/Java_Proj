package com.training.pkg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.pkg.dao.AlienDao;
import com.training.pkg.model.Alien;

/**
 * Servlet implementation class GetDataController
 */
public class GetDataController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid= Integer.parseInt(request.getParameter("aid"));
		String aname=request.getParameter("aname");
		String tech=request.getParameter("atech");
		AlienDao dao=new AlienDao();
		Alien a1 = dao.getAlien(aid,aname,tech);
		
		request.setAttribute("alien",a1);
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}
