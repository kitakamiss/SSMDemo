package com.dmm.config;

/**
 * <p>Title 		: PatternConfig</p>
 * <p>Description   : 正则表达式配置信息</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzl</p>
 * @author  		: Liangzi
 * @date 			: 2017年1月20日 下午10:20:11
 * @version 		: 1.0
 */
public class PatternConfig {
	
	// Email
	public static final String PATTERN_EMAIL 				= "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
	// 手机
	public static final String PATTERN_MOBILE 				= "^(13[0-9]|15[0-9]|18[0-9]|14[0-9]|17[0-9])\\d{8}$";
	// 电话号码(012-87654321,0123-87654321,0123－7654321)
	public static final String PATTERN_TEL 					= "^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$";
	// 日期
	public static final String PATTERN_DATE 				= "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s((([0-2]?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$";
	// URL
	public static final String PATTERN_URL 					= "((http[s]{0,1}|ftp):\\/\\/)?[a-zA-Z0-9\\.\\-]+\\.([a-zA-Z]{2,4})(:\\d+)?(/[a-zA-Z0-9\\.\\-~!@#$%^&amp;*+?:_/=<>]*)?";
	// IP
	public static final String PATTERN_IP 					= "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
	// QQ
	public static final String PATTERN_QQ 					= "[1-9][0-9]{4,13}";
	// 邮编
	public static final String PATTERN_POSTCODE 			= "[1-9]\\d{5}(?!\\d)";
	// 15位身份证号码
	public static final String PATTERN_ID_CARD_15 			= "^(\\d{18,18}|\\d{15,15}|\\d{17,17}[x|X])$";
	// 18位身份证号码
	public static final String PATTERN_ID_CARD_18 			= "^(\\d{6})(19|20)?(\\d{2})(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])(\\d{3})(\\d|x|X)?$";
	// 中文
	public static final String PATTERN_CHINESE 				= "[\u4E00-\u9FA5]";
	// 数字
	public static final String PATTERN_NUMBER 				= "^(\\-|\\+)?\\d+(\\.\\d+)?$";
	// 正整数
	public static final String PATTERN_POSITIVE_INTEGER 	= "^[0-9]*$";
	// script的正则表达式
	public static final String REGEX_SCRIPT 				= "<script[^>]*?>[\\s\\S]*?<\\/script>";
	// style的正则表达式
	public static final String REGEX_STYLE 					= "<style[^>]*?>[\\s\\S]*?<\\/style>";
	// 定义HTML标签的正则表达式
	public static final String REGEX_HTML 					= "<[^>]+>";
}
