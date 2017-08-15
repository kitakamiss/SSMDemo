package com.dmm.utils;

/**
 * <p>Title 		: StringUtils</p>
 * <p>Description   : 字符工具类</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月29日 下午7:51:35
 * @version 		: 1.0
 */
public class StringUtils {
	
	/**
	 * 判断字符是否不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if (str == null || str.length() == 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * 判断字符是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}
}
