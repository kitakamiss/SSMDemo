package com.dmm.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title			: ArraysUtils</p>
 * <p>Description	: 数组类工具</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows7_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzi
 * @date			: 2017年1月6日 下午1:09:40
 * @version			: 1.0
 */
public class ArraysUtils {

	/**
	 * 将字符串String(如:String = "1,2,3,4,5,6")转换成String数组
	 * @param string 	字符串
	 * @return 			String数组
	 */
	public static List<String> getStringListByString(String string) {
		return getStringListByString(string, ",");
	}
	
	/**
	 * 将字符串String(如:String = "1,2,3,4,5,6")转换成String数组
	 * @param string 	字符串
	 * @param splitStr 	分割字符
	 * @return 			String数组
	 */
	public static List<String> getStringListByString(String string, String splitStr) {
		if (StringUtils.isEmpty(string) || StringUtils.isEmpty(splitStr)) {
			return null;
		}
		List<String> result = new ArrayList<>();
		for (String s : string.split(splitStr)) {
			result.add(s);
		}
		return result;
	}
}
