package com.dmm.config;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;

/**
 * <p>Title			: WebBase</p>
 * <p>Description	: Web基础类</p>
 * <p>DevelopTools	: Eclipse_x64_v4.6.1</p>
 * <p>DevelopSystem	: Windows10</p>
 * <p>Company		: com.51diaocha</p>
 * @author			: XuJun
 * @date			: 2016年11月21日 下午2:01:51
 * @version			: 1.0.0
 */
public class WebBase extends BlogWebConfig {
	
	/********** RETURN处理结果消息封装 Start **********/
	/**
	 * error_code 		: 错误代码(为0的时候代表没有错误),0~1000为系统保留代码,若要自定义错误代码,请从选择1000以上的数字
	 * resp_data 		: 无错误的时候返回的数据
	 * error_msg 		: 错误信息
	 * error_msg_list 	: 错误信息列表
	 */
	
	/**
	 * 处理成功返回消息封装
	 * @return 封装后的消息
	 */
	public JSONObject returnSuccess() {
		return returnSuccess(null);
	}
	
	/**
	 * 处理成功返回消息封装
	 * @param resqData 	处理成功后返回的数据
	 * @return 			封装后的消息
	 */
	public JSONObject returnSuccess(Object resqData) {
		JSONObject data = new JSONObject();
		data.put(RETURN_ERROR_CODE, RETURN_SUCCESS_CODE);
		if (resqData != null) {
			data.put(RETURN_RESP_DATA, resqData);
		}
		return data;
	}
	
	/**
	 * 处理失败返回RETURN_ERROR_OPT_MSG消息封装
	 * @return 封装后的消息
	 */
	public JSONObject returnFailForSystemError() {
		return returnFail(RETURN_SYSTEM_ERROR_CODE, RETURN_SYSTEM_ERROR_MSG);
	}
	
	/**
	 * 处理失败返回RETURN_ILLEGAL_OPT_MSG消息封装
	 * @return 封装后的消息
	 */
	public JSONObject returnFailForErrorOpt() {
		return returnFail(RETURN_ILLEGAL_OPT_CODE, RETURN_ILLEGAL_OPT_MSG);
	}

	/**
	 * 处理失败返回消息封装
	 * @param errorCode 	错误代码
	 * @param errorMsg 		错误消息
	 * @return 				封装后的消息
	 */
	public JSONObject returnFail(Integer errorCode, String errorMsg) {
		return returnFail(errorCode, errorMsg, null);
	}
	
	/**
	 * RETURN处理失败返回消息封装
	 * @param errorCode 	错误代码
	 * @param errorMsgList 	错误消息列表
	 * @return 				封装后的消息
	 */
	public JSONObject returnFail(Integer errorCode, List<JSONObject> errorMsgList) {
		return returnFail(errorCode, null, errorMsgList);
	}
	
	/**
	 * RETURN处理失败返回消息封装
	 * @param errorCode 	错误代码
	 * @param errorMsg 		错误消息
	 * @param errorMsgList 	错误消息列表
	 * @return 				封装后的消息
	 */
	public JSONObject returnFail(Integer errorCode, String errorMsg, List<JSONObject> errorMsgList) {
		JSONObject data = new JSONObject();
		data.put(RETURN_ERROR_CODE, errorCode);
		if (errorMsg != null) {
			data.put(RETURN_ERROR_MSG, errorMsg);
		}
		if (errorMsgList != null) {
			data.put(RETURN_ERROR_MSG_LIST, errorMsgList);
		}
		return data;
	}
	
	/********** RETURN处理结果消息封装 Ends **********/
	
	/********** JSONP处理结果消息封装 Start **********/
	/**
	 * callBack 		: JSONP回调名称
	 * error_code 		: 错误代码(为0的时候代表没有错误),0~1000为系统保留代码,若要自定义错误代码,请从选择1000以上的数字
	 * resp_data 		: 无错误的时候返回的数据
	 * error_msg 		: 错误信息
	 * error_msg_list 	: 错误信息列表
	 */
	
	/**
	 * JSONP处理成功返回消息封装
	 * @param callBack 	JSONP回调名称
	 * @return 			封装后的消息
	 */
	public JSONPObject jsonpSuccess(String callBack) {
		return jsonpSuccess(callBack, null);
	}
	
	/**
	 * JSONP处理成功返回消息封装
	 * @param callBack 	JSONP回调名称
	 * @param resqData 	处理成功后返回的数据
	 * @return 			封装后的消息
	 */
	public JSONPObject jsonpSuccess(String callBack, Object resqData) {
		JSONObject data = new JSONObject();
		data.put(RETURN_ERROR_CODE, RETURN_SUCCESS_CODE);
		if (resqData != null) {
			data.put(RETURN_RESP_DATA, resqData);
		}
		JSONPObject jsonp = new JSONPObject(callBack);
		jsonp.addParameter(data);
		return jsonp;
	}

	/**
	 * 处理失败返回RETURN_ERROR_OPT_MSG消息封装
	 * @param callBack 	JSONP回调名称
	 * @return 			封装后的消息
	 */
	public JSONPObject jsonpFailForSystemError(String callBack) {
		return jsonpFail(callBack, RETURN_SYSTEM_ERROR_CODE, RETURN_SYSTEM_ERROR_MSG);
	}
	
	/**
	 * JSONP处理失败返回RETURN_ILLEGAL_OPT_MSG消息封装
	 * @param callBack 	JSONP回调名称
	 * @return 			封装后的消息
	 */
	public JSONPObject jsonpFailForErrorOpt(String callBack) {
		return jsonpFail(callBack, RETURN_ILLEGAL_OPT_CODE, RETURN_ILLEGAL_OPT_MSG);
	}
	
	/**
	 * JSONP处理失败返回消息封装
	 * @param callBack 		JSONP回调名称
	 * @param errorCode 	错误代码
	 * @param errorMsg 		错误消息
	 * @return 				封装后的消息
	 */
	public JSONPObject jsonpFail(String callBack, Integer errorCode, String errorMsg) {
		return jsonpFail(callBack, errorCode, errorMsg, null);
	}
	
	/**
	 * JSONP处理失败返回消息封装
	 * @param callBack 		JSONP回调名称
	 * @param errorCode 	错误代码
	 * @param errorMsgList 	错误消息列表
	 * @return 				封装后的消息
	 */
	public JSONPObject jsonpFail(String callBack, Integer errorCode, List<JSONObject> errorMsgList) {
		return jsonpFail(callBack, errorCode, null, errorMsgList);
	}
	
	/**
	 * JSONP处理失败返回消息封装
	 * @param callBack 		JSONP回调名称
	 * @param errorCode 	错误代码
	 * @param errorMsg 		错误消息
	 * @param errorMsgList 	错误消息列表
	 * @return 				封装后的消息
	 */
	public JSONPObject jsonpFail(String callBack, Integer errorCode, String errorMsg, List<JSONObject> errorMsgList) {
		JSONObject data = new JSONObject();
		data.put(RETURN_ERROR_CODE, errorCode);
		if (errorMsg != null) {
			data.put(RETURN_ERROR_MSG, errorMsg);
		}
		if (errorMsgList != null) {
			data.put(RETURN_ERROR_MSG_LIST, errorMsgList);
		}
		JSONPObject jsonp = new JSONPObject(callBack);
		jsonp.addParameter(data);
		return jsonp;
	}
	
	/********** JSONP处理结果消息封装 Ends **********/
	
	/**
	 * 获取Web项目根路径
	 * @param request 	HttpServletRequest
	 * @return 			Web项目根路径
	 */
	public String getWebRootPath(HttpServletRequest request) {
		return request.getSession().getServletContext().getRealPath("");
	}
	
	}
