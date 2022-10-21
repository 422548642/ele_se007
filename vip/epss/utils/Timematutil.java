package vip.epss.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timematutil {
    public static String matTime(String p, Date d){
        if (p==null){
            p="yyyy年MM月dd日";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
        return simpleDateFormat.format(d);
    }
}
