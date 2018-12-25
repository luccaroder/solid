package com.example.ocp.good;

import com.example.ClientType;

public class Normal implements Client {
    @Override
    public String verifyMessage() {
        return "Faça nosso seguro e se torne especial para nós!";
    }
}
