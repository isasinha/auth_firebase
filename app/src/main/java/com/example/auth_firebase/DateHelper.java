package com.example.auth_firebase;

import java.text.SimpleDateFormat;

class DateHelper {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static String format (java.util.Date date){
        return sdf.format(date);
    }
}
