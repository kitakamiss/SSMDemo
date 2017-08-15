package com.dmm.dao;

import com.dmm.model.User;
import com.dmm.base.model.QueryVo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>Title	 		: UserMapper</p>
 * <p>Description	: User Dao </p>
 * <p>DevelopTools	: Eclipse_x64_v4.6.2</p>
 * <p>DevelopSystem	: liangzl's Code Generator</p>
 * <p>Company	 	: com.liangzl</p>
 * @author	 		: liangzl
 * @date	 		: 2017年08月02日 23:25:41
 * @version	 		: 6.0.0
 */
public interface UserMapper {

	/**
	 * 选择性插入一条数据
	 * @param user  Model数据
	 * @return 影响行数
	 */
	Integer insertSelective(@Param("user") User user);
	
	/**
	 * 根据主键删除数据
	 * @param userid 
	 * @return 影响行数
	 */
	Integer deleteByPrimaryKey(@Param("userid") Integer userid);
	
	/**
	 * 根据条件删除数据
	 * @param queryVo 	删除条件
	 * @return 			影响行数
	 */
	Integer deleteByWhere(@Param("queryVo") QueryVo queryVo);
	
	/**
	 * 根据主键选择性更新数据
	 * @param user  Model数据
	 * @return 影响行数
	 */
	Integer updateByPrimaryKey(@Param("user") User user);
	
	/**
	 * 根据条件选择性更新数据
	 * @param queryVo 	查询条件
	 * @param user  Model数据
	 * @return 影响行数
	 */
	Integer updateByWhere(@Param("queryVo") QueryVo queryVo, @Param("user") User user);
	
	/**
	 * 根据主键查询数据
	 * @param userid 
	 * @return  Model数据
	 */
	User selectByPrimaryKey(@Param("userid") Integer userid);
	
	/**
	 * 根据查询条件查询数据
	 * @param queryVo 	查询条件
	 * @return  列表数据
	 */
	List<User> selectByWhere(@Param("queryVo") QueryVo queryVo);
	
	/**
	 * 根据查询条件统计结果
	 * @param queryVo 	查询条件
	 * @return 			统计的数据条数
	 */
	Long countByWhere(@Param("queryVo") QueryVo queryVo);

}