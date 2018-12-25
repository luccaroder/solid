package com.example.dip.bad;

public class NotifierEmail implements Notifier {

    @Override
    public String notifyEmail() {
        return "OK";
    }

    @Override
    public String NotifySms() {
        throw new UnsupportedOperationException();
    }
}
