package com.example.isp.bad;

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
