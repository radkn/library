package com.firstlibrary.controller.commands;

import javax.servlet.http.HttpServletRequest;

public class Logout implements Command{
    @Override
    public String execute(HttpServletRequest request) {
        //TODO: logout
        return "/index.jsp";
    }
}
