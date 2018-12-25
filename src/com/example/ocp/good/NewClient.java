package com.example.ocp.good;

import com.example.ClientType;

public class NewClient implements Client {
    @Override
    public String verifyMessage() {
        return "Parabéns por fazer parte da nossa família";
    }
}
