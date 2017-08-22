package com.chapter3Lambda;

/**
 * Created by wangwenchao02 on 2017/8/17.
 */
public class Letter {

    private String header;
    private String footer;

    public String addHeader(String body) {
        return "This is header\n" + body;
    }

    public String addFooter(String body) {
        return body + "\nThis is footer\n";
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
