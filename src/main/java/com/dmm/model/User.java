package com.dmm.model;

import java.io.Serializable;

/**
 * <p>Title	 		: User</p>
 * <p>Description	: User Model </p>
 * <p>DevelopTools	: Eclipse_x64_v4.6.2</p>
 * <p>DevelopSystem	: liangzl's Code Generator</p>
 * <p>Company	 	: com.liangzl</p>
 * @author	 		: liangzl
 * @date	 		: 2017年08月02日 23:24:57
 * @version	 		: 6.0.0
 */
public class User implements Serializable {

	/** SerialVersionUID **/
	private static final long serialVersionUID = 1L;

	private Integer userid;
	
	private String username;
	
	private String password;
	
	/**
	 * 构造方法
	 */
	public User() {}
	
	/**
	 * 构造方法
	 * @param userid 
	 * @param username 
	 * @param password 
	 */
	public User(Integer userid, String username, String password) {
		this.userid = userid;
		this.username = username;
		this.password = password;
	}

	/** Get || Set 方法 Start **/
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/** Get || Set 方法 Ends **/
	
	/**
	 * User Model详情
	 * @return Model详情
	 */
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer("User Data:[");
		stringBuffer.append("userid = ");
		stringBuffer.append(String.valueOf(userid));
		stringBuffer.append(", username = ");
		stringBuffer.append(String.valueOf(username));
		stringBuffer.append(", password = ");
		stringBuffer.append(String.valueOf(password));
		stringBuffer.append("]");
		return stringBuffer.toString();
	}
	
	/**
	 * 数据库表名称
	 */
	public final static String Q_tableName = "user";
	
	/** 查询字段名 Start **/
	
	public final static String Q_userid = "Userid";
	
	public final static String Q_username = "USERNAME";
	
	public final static String Q_password = "Password";
	
	/** 查询字段名 Ends **/
}