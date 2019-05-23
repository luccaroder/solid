package com.example.dip.good;

public interface Notifier {

    static NotifierEmail notifyEmail() {
        return new NotifierEmail();
    }

    static NotifierSms notifySms() {
        return new NotifierSms();
    }
    String notifyNewProduct();

}
