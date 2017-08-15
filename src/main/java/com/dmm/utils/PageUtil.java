package com.dmm.utils;


/**
 * <p>Title 		: PageUtil</p>
 * <p>Description   : 分页工具类</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月3日 下午8:54:04
 * @version 		: 1.0
 */
public class PageUtil {
	
	/**
	 * 获取总页数
	 * @param maxSize
	 * @return
	 */
	public static int getMaxPage(int maxSize, int pageSize) {
		if (maxSize == 0) {
			return 1;
		}
		if (maxSize % pageSize == 0) {
			maxSize = maxSize / pageSize;
		} else {
			maxSize = maxSize / pageSize + 1;
		}
		return maxSize;
	}
}
