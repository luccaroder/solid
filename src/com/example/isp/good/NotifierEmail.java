package com.example.isp.good;

public class NotifierEmail implements NotifierPaymentEmail, NotifierNewProduct {

    @Override
    public String notifyNewProduct() {
        return "OK";
    }

    @Override
    public String notifyPayment() {
        return "OK";
    }
}
