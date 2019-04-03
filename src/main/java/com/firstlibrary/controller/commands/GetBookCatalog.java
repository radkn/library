package com.firstlibrary.controller.commands;

import javax.servlet.http.HttpServletRequest;

public class GetBookCatalog implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/catalog.jsp";
    }
}
