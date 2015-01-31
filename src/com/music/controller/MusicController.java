package com.music.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicController extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException,IOException {  
		
		RequestDispatcher dispatcher = null;
		String url = request.getServletPath();
		Action action = Action.getAction(url.substring(1, url.length() - 3));
		
		//Flow forward
		String urlTarget = action.execute(request, response);
		dispatcher = request.getRequestDispatcher(urlTarget);
		dispatcher.forward(request, response);
	}
	
}
