package com.example.dip.good;

import com.example.User;
import com.example.dip.bad.NotifierEmail;
import com.example.dip.bad.NotifierSms;

import java.util.Objects;

public class NotifierUserService {

    private Notifier notifier;

    public NotifierUserService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(User user) {
        if (Objects.nonNull(user) && Objects.nonNull(user.getEmail())) {
            NotifierEmail email = new NotifierEmail();
            email.notifyEmail();
        }
        if (Objects.nonNull(user) && Objects.nonNull(user.getPhone())) {
            NotifierSms sms = new NotifierSms();
            sms.notifyEmail();
        }
    }
}
