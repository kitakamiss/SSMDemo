package com.dmm.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;


public class JettyServer {
	/**
	 * main
	 * @param args 			参数
	 * @throws Exception 	jetty异常
	 */
	public static void main(String[] args) throws Exception {
		new JettyServer().startJettyServer();
	}

	/**
	 * 启动jetty服务
	 * @throws Exception jetty异常
	 */
	public void startJettyServer() throws Exception {
		System.out.println("Jetty初始化...");

		Integer port = 22222; // 端口
		String contextPath = "";
		String resourceBase = "./src/main/webapp"; // 项目目录
		Server server = new Server(port);
		WebAppContext webAppContext = new WebAppContext();
		webAppContext.setContextPath(contextPath); // 项目上下文
		webAppContext.setResourceBase(resourceBase);
		webAppContext.setDefaultsDescriptor("/webdefault.xml");
		server.setHandler(webAppContext);

		// 指定Spring加载的配置文件名称
		System.setProperty("spring.profiles.default", "dev");

		System.out.println("Jetty启动...");
		server.start();

		String finalResourceBase = webAppContext.getResourceBase();
		String finalCntextPath = webAppContext.getContextPath();
		System.out.println("项目地址:" + finalResourceBase);
		System.out.println("上下文:" + finalCntextPath);
		String projectUrl = "http://127.0.0.1:22222/index.html";
		System.out.println("项目URL: " + projectUrl);
		// 跳转项目URL 页面 (Windows 环境下,调用默认浏览器打开 )
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + projectUrl);
		server.join();
	}
}
