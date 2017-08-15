package com.dmm.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * <p>Title			: SerializeUtils</p>
 * <p>Description	: 序列化工具类</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows7_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzi
 * @date			: 2017年1月23日 下午2:08:44
 * @version			: 1.0
 */
public class SerializeUtils  {
	
	/**
	 * 将Object序列化成byte[]
	 * @param object	Object数据
	 * @return 			byte[]数据
	 */
	public static byte[] serialize(Object object) {
		return JSONObject.toJSONBytes(object, SerializerFeature.WriteClassName);
	}

	/**
	 * 将byte[]反序列化成Object
	 * @param bytes	byte[]数据
	 * @return 		Object数据
	 */
	public static Object deserialize(byte[] bytes) {
		return JSONObject.parse(bytes, Feature.IgnoreNotMatch);
	}

}
