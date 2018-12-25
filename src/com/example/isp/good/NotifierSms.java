package com.example.isp.good;

public class NotifierSms implements NotifierPaymentSms, NotifierNewProduct {

    @Override
    public String notifyNewProduct() {
        return "OK";
    }

    @Override
    public String notifyPayment() {
        return "OK";
    }
}
