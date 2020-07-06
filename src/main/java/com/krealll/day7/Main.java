package com.krealll.day7;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1,s2,country=" ",language=" ";
        System.out.println("1 — Английский \n2 — Белорусский \nЛюбой — Русский ");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        switch (i) {
            case '1':
                country = "US";
                language = "en";
                break;
            case '2':
                country = "BY";
                language = "be";
                break;
            default:
                country="RU";
                language="ru";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        s1 = rb.getString("string1");
        s2 = rb.getString("string2");
        System.out.println(s1);
        System.out.println(s2);
    }
}
