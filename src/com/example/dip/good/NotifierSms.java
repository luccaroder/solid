package com.example.dip.good;

import com.example.User;

import java.util.Objects;

public class NotifierSms implements NotifierPaymentSms, NotifierNewProduct {

    @Override
    public String notifyNewProduct() {
        return "OK";
    }

    @Override
    public void notifyPayment(User user) {
        if (Objects.nonNull(user) && Objects.nonNull(user.getPhone())) {
            System.out.println("Notificação enviada (Telefone)");
        }
    }
}
