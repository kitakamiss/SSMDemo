package com.dmm.config;

/**
 * <p>Title 		: BlogWebConfig</p>
 * <p>Description   : 博客网络配置参数</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2017年1月14日 下午8:55:13
 * @version 		: 1.0
 */
public class BlogWebConfig {
	
	/** 获取IP地址的详细信息 **/
	public static final String IP_GET_ADDR 					= "http://ip.taobao.com/service/getIpInfo.php";     //淘宝
	public static final String IP_GET_ADDR_SINA 			= "http://int.dpool.sina.com.cn/iplookup/iplookup.php"; //新浪 

	/** COOKIE Start **/
	// COOKIE默认超时时间
	public static final Integer COOKIE_DEFAULT_OVER_TIME 	= 24 * 60 * 60;
	// 默认路径
	public static final String COOKIE_DEFAULT_PATH 		 	= "/";
	// 点赞索引
	public static final String COOKIE_PRAISE_NAME 		 	= "vistor.praise";	
	
	/** 内网默认ip **/
	public static final String DEFAULT_IP 					= "未分配或者内网IP";
	public static final String DEFAULT_ADDRESS				= "未查询到详细地址";
	
	/** 终端分类 **/
	public final static String PC							="PC端访问";
	public final static String PHONE						="移动端访问";
	
	/** 首页左侧文章个数 **/
	public final static int BLOGREADARTICLECOUNT			=10;
	// 左侧最新文章个数
	public final static int BLOGNEWARTICLECOUNT				=10;
	// 左侧评论个数
	public final static int BLOGNEWARTICLECOMMENTCOUNT		=10;
	// 首页文章标签个数
	public final static int BLOGINDEXARTICLENAVIGATIONCOUNT	=5;
	// 首页文章评论个数
	public final static int BLOGINDEXARTICLECOMMENTCOUNT	=5;
	
	/** 博客分页个数 **/
	// 留言显示个数
	public final static int BLOG_COMMENT_PAGESIZE			=10;
	
	// 搜索文章个数
	public final static int BLOG_SEARCH_PAGESIZE			=10;
	
	/** Web返回信息 Start **/
	public static final String RETURN_ERROR_CODE 			= "error_code"; 											// 错误代码(为0的时候代表没有错误),0~1000为系统保留代码,若要自定义错误代码,请从选择1000以上的数字
	public static final String RETURN_RESP_DATA 			= "resp_data"; 												// 无错误的时候返回的数据
	public static final String RETURN_ERROR_MSG 			= "error_msg"; 												// 错误信息
	public static final String RETURN_ERROR_MSG_LIST 		= "error_msg_list"; 										// 错误信息列表
	public static final String RETURN_SYSTEM_ERROR_MSG 		= "系统错误"; 												// 返回系统错误信息
	public static final String RETURN_ILLEGAL_OPT_MSG 		= "非法操作"; 												// 返回非法操作信息
	public static final Integer RETURN_SUCCESS_CODE 		= 0; 														// 返回成功代码
	public static final Integer RETURN_SYSTEM_ERROR_CODE 	= 100; 														// 返回系统错误代码
	public static final Integer RETURN_ILLEGAL_OPT_CODE 	= 200; 														// 返回非法操作代码
	/** Web返回信息 Ends **/
	
	/** kindEditor **/ 
	public static final String PATH_LINE					= "/";
	public static final String PICTURE_SPACE_URL			= "/editorImages/";
	public static final String PICTURE_URL					= "/editorImages/";
	
	/** 验证码 **/
	public static final String STRINGSET_UPPERCASE 			= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String STRINGSET_LOWERCASE 			= "abcdefghijklmnopqrstuvwxyz";
	public static final String STRINGSET_NUMBER 			= "0123456789";
	public static final String STRINGSET_DEFAULT 			= STRINGSET_UPPERCASE + STRINGSET_LOWERCASE + STRINGSET_NUMBER;
	
	/** 图片验证码前缀 **/
	public static final String IMAGE_CODE_PREFIX 			= "imageCode_";
	
	/** Mgr图片验证码名称 **/ 
	public static final String MGR_IMAGE_CODE_NAME 			= "store.mgr.image.code";
	
	/** Mgr图片验证码Session超时时间(秒) **/ 
	public static final Integer MGR_IMAGE_CODE_OVER_TIME 	= 5 * 60;
	
	/** 流量攻击指标 **/
	public final static Integer GRADE_ONE 								=40;
	public final static Integer GRADE_TWO								=60;
	public final static String OPERATIONTYPE_IP_TWO						= "二级流量攻击";
	public final static String OPERATIONTYPE_IP_ONE						= "一级流量攻击";
	public final static String OPERATIONTYPE_IP_ATCILE_COMMENT			= "刷文章评论";
	public final static String OPERATIONTYPE_IP_COMMENT					= "刷留言板评论";
}
