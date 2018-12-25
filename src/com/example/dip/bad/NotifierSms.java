package com.example.dip.bad;

public class NotifierSms implements Notifier {
    @Override
    public String notifyEmail() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String NotifySms() {
        return "OK";
    }
}
