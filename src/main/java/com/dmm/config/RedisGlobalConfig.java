package com.dmm.config;


/**
 * <p>Title			: RedisGlobalConfig</p>
 * <p>Description	:  Redis配置信息</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows7_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzi
 * @date			: 2017年1月23日 下午2:06:28
 * @version			: 1.0
 */
public class RedisGlobalConfig  {
	
	// 缓存Key生存时间(365天 = 365 * 24 * 60 * 60)
	public static final int REDIS_DEFAULT_EXPIRE = 31536000;
	
	// 缓存Key生存时间(1天 = 24 * 60 * 60)
	public static final int REDIS_DEFAULT_ONE_DAY = 86400;

}
