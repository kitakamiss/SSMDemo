package com.dmm.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>Title 		: TimesUtil</p>
 * <p>Description   : 时间转换</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月29日 下午9:02:26
 * @version 		: 1.0
 */
public class TimesUtil {
	
	 /** 
     * 获取当前时间 yyyyMMddHHmmss 
     * @return String 
     */  
    public static String getCurrTime() {  
        Date now = new Date();  
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMddHHmmss");  
        String s = outFormat.format(now);  
        return s;  
    }
    
    /** 
     * 获取当前时间 yyyyMMddHH
     * @return String 
     */  
    public static String getNow() {  
        Date now = new Date();  
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMdd");  
        String s = outFormat.format(now);  
        return s;  
    }
    
    /**
     * 讲Date转换成yyyyMMddHHmmss 格式
     * @return
     */
    public static String getCurrTime(Date date) {  
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String s = outFormat.format(date);  
        return s;  
    }
    
    /**
     * 获得昨日时间   格式:yyyyMMdd 
     * @return
     */
    public static String getYesterday() {  
    	Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMdd");  
        String s = outFormat.format(cal.getTime());  
        return s;  
    }
    
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
    	System.out.println(getCurrTime());
	}
}
