package com.example.candyshop.service.impl;

import com.example.candyshop.models.Client;
import com.example.candyshop.service.ClientService;

import java.util.HashSet;

public class ClientServiceimpl implements ClientService {
    private HashSet<Client>listClients;

    private final Sweety sweety;

    public ClientServiceimpl(Sweety sweety) { this.sweety = sweety;
    }

    public HashSet<Client> getListClients() {
        return listClients;
    }

    public void setListClients(HashSet<Client> listClients) {
        this.listClients = listClients;
    }

    public Sweety getSweety() {
        return sweety;
    }

    @Override
    public void createClient(String name, String password) {

    }
}
