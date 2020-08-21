package com.cleanbean.beans;

import com.cleanbean.mail.Mail;

public class MailBean {

    @Mail
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
