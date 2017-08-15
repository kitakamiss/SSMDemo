package com.dmm.utils;

import java.util.UUID;


/**
 * <p>Title 		: UuidUtils</p>
 * <p>Description   : UUID工具类</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzl</p>
 * @author  		: Liangzi
 * @date 			: 2017年1月24日 下午7:36:35
 * @version 		: 1.0
 */
public class UuidUtils {
	
	/**
	 * 新建UUID随机码
	 * @return UUID随机码(16进制)
	 */
	public static String newUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
