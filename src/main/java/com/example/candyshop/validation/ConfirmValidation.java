package com.example.candyshop.validation;

import com.example.candyshop.Exception.InputException;
import com.example.candyshop.models.Client;
import com.example.candyshop.utilities.Checkdouble;

import javax.swing.*;
import java.util.HashSet;

public class ConfirmValidation {
    public static Boolean registerClient(String name,String password,String confirmPassword, HashSet<Client> people){
        HashSet<Client>peoples=people;
        System.out.println(password.equals(confirmPassword));
        if(NullValidation.nullRegister(name, password, confirmPassword) && password.equals(confirmPassword) && Checkdouble.verifyNameProfile(name,people)) {
            return true;
        }else {
            try {
                throw new InputException("Information is missing");
            }catch (InputException ie){
                JOptionPane.showMessageDialog(null,ie.getMessage()+"Lack of information");
                return false;
            }
        }
    }
}
