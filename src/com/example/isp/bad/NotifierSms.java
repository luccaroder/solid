package com.example.isp.bad;

public class NotifierSms implements Notifier {
    @Override
    public String notifyPayment() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String notifyNewProduct() {
        return "OK";
    }
}
