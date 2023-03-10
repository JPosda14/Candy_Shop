package com.example.candyshop.Controller.Servlets;

import com.example.candyshop.Controller.ModelFactoryController;
import com.example.candyshop.persistence.ClientPersistence;
import com.example.candyshop.validation.ConfirmValidation;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ClientSv", value = "/ClientSv")
public class ClientSv extends HttpServlet {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    mfc.getSweety().getClientServiceimpl().setListClients(ClientPersistence.loadClient());
    String name=request.getParameter("name");
    String password=request.getParameter("password");
    String confirmPassword=request.getParameter("confirmpassword");
    if(ConfirmValidation.registerClient(name,password,confirmPassword,mfc.getSweety().getClientServiceimpl().getListClients())){
        mfc.createClient(name,password);
        ClientPersistence.saveClient(mfc.getSweety().getClientServiceimpl().getListClients());
        response.sendRedirect("index.jsp");
        }
    }
}
