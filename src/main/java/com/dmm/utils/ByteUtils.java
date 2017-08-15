package com.dmm.utils;


/**
 * <p>Title			: ByteUtils</p>
 * <p>Description	: Byte工具类</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows7_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzi
 * @date			: 2017年1月23日 下午2:03:36
 * @version			: 1.0
 */
public class ByteUtils {
	
	/**
	 * 判断字节数组是否为空或没有数据
	 * @param bytes 	字节数组
	 * @return 			true or false
	 */
	public static boolean isEmpty(byte[] bytes) {
		if (bytes == null || bytes.length <= 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 
	 * 判断字节数组是否不为空或没有数据
	 * @param bytes 	字节数组
	 * @return 			true or false
	 */
	public static boolean isNotEmpty(byte[] bytes) {
		if (bytes == null || bytes.length <= 0) {
			return false;
		} else {
			return true;
		}
	}

}
