package com.firstlibrary.controller.commands;

import javax.servlet.http.HttpServletRequest;

public interface Command {
    String execute(HttpServletRequest request);
}
