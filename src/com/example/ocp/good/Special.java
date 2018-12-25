package com.example.ocp.good;

import com.example.ClientType;

public class Special implements Client {
    @Override
    public String verifyMessage() {
        return "Você possui mais benefícios para sua próxima compra";
    }
}
