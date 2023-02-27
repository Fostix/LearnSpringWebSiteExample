package com.learn.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	// http://localhost:8090/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> HTML page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	// add in pom!!	
	//	<dependency>
	//	<groupId>org.apache.tomcat.embed</groupId>
	//	<artifactId>tomcat-embed-jasper</artifactId>
	//	<scope>provided</scope>
	//	<version>11.0.0-M3</version>
	// </dependency>
	
	// "say-hello--jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/saytodos.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
