package com.dmm.utils;

import java.util.List;

/**
  * <p>Title 		 : ListUtils</p>
  * <p>Description	 : List工具类</p>
  * <p>DevelopTools	 : Eclipse_x64_v4.6.1</p>
  * <p>DevelopSystem : win10</p>
  * <p>Company 		 : com.diaocha</p>
  * @author			 : Liangzl
  * @date 			 : 2017年4月25日 下午5:14:02
  * @version 		 : 5.0.0
 */
public class ListUtils {
	
	/**
	 * 判断List是否为空或没有数据
	 * @param <T>	泛型
	 * @param list 	列表
	 * @return 		true or false
	 */
	public static <T> boolean isEmpty(List<T> list) {
		return !isNotEmpty(list);
	}
	
	/**
	 * 判断List是否不为空或没有数据
	 * @param <T>	泛型
	 * @param list 	列表
	 * @return 		true or false
	 */
	public static <T> boolean isNotEmpty(List<T> list) {
		if (list == null || list.size() <= 0) {
			return false;
		} else {
			return true;
		}
	}

}