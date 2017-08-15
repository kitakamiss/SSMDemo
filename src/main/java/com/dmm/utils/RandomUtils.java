package com.dmm.utils;

import java.util.Random;


/**
 * <p>Title 		: RandomUtils</p>z
 * <p>Description   : 随机数工具类</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzl</p>
 * @author  		: Liangzi
 * @date 			: 2017年1月17日 下午9:48:46
 * @version 		: 1.0
 */
public class RandomUtils {
	
	/** 验证码 **/
	public static final String STRINGSET_UPPERCASE 			= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String STRINGSET_LOWERCASE 			= "abcdefghijklmnopqrstuvwxyz";
	public static final String STRINGSET_NUMBER 			= "0123456789";
	public static final String STRINGSET_DEFAULT 			= STRINGSET_UPPERCASE + STRINGSET_LOWERCASE + STRINGSET_NUMBER;
    /** 
     * 随机指定范围内N个不重复的数 
     * 最简单最基本的方法 
     * @param min 指定范围最小值 
     * @param max 指定范围最大值 
     * @param n 随机数个数 
     */  
    public static int[] getRandomNum(int min, int max, int n){  
        if (n > (max - min + 1) || max < min) {  
               return null;  
           }  
        int[] result = new int[n];  
        int count = 0;  
        while(count < n) {  
            int num = (int) (Math.random() * (max - min)) + min;  
            boolean flag = true;  
            for (int j = 0; j < n; j++) {  
                if(num == result[j]){  
                    flag = false;  
                    break;  
                }  
            }  
            if(flag){  
                result[count] = num;  
                count++;  
            }  
        }  
        return result;  
    }
    
	/**
	 * 获取随机字符串
	 * @param size 	随机字符串长度
	 * @return 		随机字符串
	 */
	public static String getRandomString(int size) {
		return getRandomString(size, RandomUtils.STRINGSET_DEFAULT);
	}
	
	/**
	 * 获取随机字符串
	 * @param size 		随机字符串长度
	 * @param stringSet	字符串集合
	 * @return 			随机字符串
	 */
	public static String getRandomString(int size, String stringSet) {
		if(size <= 0 || stringSet == null) {
			return null;
		}
		StringBuffer buffer = new StringBuffer(size);
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			buffer.append(stringSet.charAt(random.nextInt(stringSet.length())));
		}
		return buffer.toString();
	}

}
