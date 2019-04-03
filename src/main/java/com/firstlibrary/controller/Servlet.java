package com.firstlibrary.controller;

import com.firstlibrary.controller.commands.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {

    private String REDIRECT_COMMAND = "redirect:";
    private Map<String, Command> commands = new HashMap<>();

    @Override
    public void init(){
        commands.put("login", new Login());
        commands.put("logout", new Logout());
        commands.put("registration", new Registration());
        commands.put("catalog", new GetBookCatalog());
        System.out.println("Servlet init");
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Servlet doGet");
        requestProcess(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Servlet doPost");
        requestProcess(request, response);
    }

    public void requestProcess(HttpServletRequest request,
                   HttpServletResponse response) throws ServletException, IOException {

        String fullPath = request.getRequestURI();
        String path = fullPath.replaceAll(".*/lib/","");
        Command command = commands.getOrDefault(path, r ->"/index.jsp");
        System.out.println(command.getClass().getSimpleName());
        String answer = command.execute(request);

        if(answer.contains(REDIRECT_COMMAND)){
            response.sendRedirect(request.getContextPath()
                    +answer.replaceAll(REDIRECT_COMMAND, ""));
        }else
            request.getRequestDispatcher(answer).forward(request,response);


    }
}
