package com.firstlibrary.controller.commands;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String login = request.getParameter("email");
        String pass = request.getParameter("pass");

        if( login == null || login.equals("") || pass == null || pass.equals("")  ){
            return "/login.jsp";
        }

        if(pass.equals("admin")){
            return "redirect:/catalog";
        }else{
            return "/index.jsp";

        }
    }
}
