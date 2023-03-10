package com.example.candyshop.service.impl;

import com.example.candyshop.models.Candy;
import com.example.candyshop.models.Client;

public class Sweety {
    private final ClientServiceimpl clientServiceimpl;

    public Sweety() {
        this.clientServiceimpl = new ClientServiceimpl(this);
    }

    public ClientServiceimpl getClientServiceimpl() {
        return clientServiceimpl;
    }
}
