package com.example.dip.good;

import com.example.User;

import java.util.Objects;

public class NotifierEmail implements NotifierPaymentEmail, NotifierNewProduct {

    @Override
    public String notifyNewProduct() {
        return "OK";
    }

    @Override
    public void notifyPayment(User user) {
        if (Objects.nonNull(user) && Objects.nonNull(user.getEmail())) {
            System.out.println("Notificação enviada (Email)");
        }
    }
}
