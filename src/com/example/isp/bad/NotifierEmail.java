package com.example.isp.bad;

public class NotifierEmail implements Notifier {

    @Override
    public String notifyPayment() {
        return "OK";
    }

    @Override
    public String notifyNewProduct() {
        return "OK";
    }
}
