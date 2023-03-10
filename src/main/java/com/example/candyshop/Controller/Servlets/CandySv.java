package com.example.candyshop.Controller.Servlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.candyshop.models.Client;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class CandySv extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }

    public void destroy() {
    }
}