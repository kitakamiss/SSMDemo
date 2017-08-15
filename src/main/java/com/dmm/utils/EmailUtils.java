package com.dmm.utils;

import java.util.Date;
import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * <p>Title			: EmailUtils</p>
 * <p>Description	: 发送邮箱信息Utils</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows7_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzi
 * @date			: 2016年12月30日 下午12:01:39
 * @version			: 1.0
 */
public class EmailUtils {
	
	/**
	 * @param context   发送的内容
	 * @param subject	发送的主题
	 * @param to        接收方邮箱
	 * @param from      发送方邮箱
	 * @param password  发送方密码
	 */
	public static void sendEmail(String context, String subject, String to, String from, String password){
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();  
        // 设定mail server  
        senderImpl.setHost("smtp.163.com");  
        // 建立邮件消息  
        SimpleMailMessage mailMessage = new SimpleMailMessage();  
        mailMessage.setTo(to);  
        mailMessage.setFrom(from);  
        mailMessage.setSubject(subject);  
		mailMessage.setText(context);
        senderImpl.setUsername(from); // 根据自己的情况,设置username  
        senderImpl.setPassword(password); // 根据自己的情况, 设置password  
        Properties prop = new Properties();  
        prop.put("mail.smtp.auth", "true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确  
        prop.put("mail.smtp.timeout", "25000");  
        senderImpl.setJavaMailProperties(prop);  
        // 发送邮件  
        senderImpl.send(mailMessage);  
	}
	
	// 发送邮箱
	public static void sendEmail(String context, String ip){
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();  
        // 设定mail server  
        senderImpl.setHost("smtp.163.com");  
        // 建立邮件消息  
        SimpleMailMessage mailMessage = new SimpleMailMessage();  
        mailMessage.setTo("419400980@qq.com");  
        mailMessage.setFrom("15960199764@163.com");  
        mailMessage.setSubject("博客被攻击 ");  
		mailMessage.setText("攻击类型:" + context + "   ip:" + ip + "   时间:" + TimesUtil.getCurrTime(new Date()));
        senderImpl.setUsername("15960199764@163.com"); // 根据自己的情况,设置username  
        senderImpl.setPassword("Forever33teaegg"); // 根据自己的情况, 设置password  
        Properties prop = new Properties();  
        prop.put("mail.smtp.auth", "true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确  
        prop.put("mail.smtp.timeout", "25000");  
        senderImpl.setJavaMailProperties(prop);  
        // 发送邮件  
        senderImpl.send(mailMessage);  
	}
}
