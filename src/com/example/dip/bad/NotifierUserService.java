package com.example.dip.bad;

import com.example.User;

import java.util.Objects;

public class NotifierUserService {

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
