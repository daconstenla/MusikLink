package com.music.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
	
	abstract public String execute(HttpServletRequest request, HttpServletResponse response);
	
	public static Action getAction(String tipo) {
		Action action = null;
		
		String actionName = Action.class.getPackage().getName() + ".actions." + tipo + "Action";
		try {
			action = (Action) Class.forName(actionName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return action;
	}
}
