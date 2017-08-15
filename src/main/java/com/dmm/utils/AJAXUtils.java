package com.dmm.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>Title 		: AJAXUtils</p>
 * <p>Description   : 判断是否是ajax提交</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月28日 下午8:28:19
 * @version 		: 1.0
 */
public class AJAXUtils {
	
	/**
	 * 判断请求是否为Ajax
	 * @param request 	HttpServletRequest
	 * @return 			true or false
	 */
	public static boolean isAjaxRequest(HttpServletRequest request) {
		String ajaxPostReqHead = request.getHeader("X-Requested-With");
		String ajaxGetReqHead = request.getHeader("RequestType");
		if (ajaxPostReqHead !=null && !"".equals(ajaxPostReqHead) && ajaxPostReqHead.equals("XMLHttpRequest") || (ajaxGetReqHead != null && !"".equals(ajaxGetReqHead)&& ajaxGetReqHead.equalsIgnoreCase("ajax"))) {
			return true;
		} else {
			return false;
		}
	}

}
