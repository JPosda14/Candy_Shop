package com.example.candyshop.utilities;

import com.example.candyshop.models.Client;

import java.util.HashSet;

public class Checkdouble {public static Boolean verifyNameProfile(String name, HashSet<Client> people){
    Boolean resultado=false;
    if (people.size()==0)resultado=true;
    for (Client client : people) {
        resultado = (name.equals(client.getName())) ? false : true;

        if (!resultado)break;
    }
    return resultado;
}
}
