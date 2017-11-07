package com.greenfoxacademy.frontend.model;

public class AppendA {

    public String appended;

    public AppendA(String appended) {
        this.appended = appended.concat("a");
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
