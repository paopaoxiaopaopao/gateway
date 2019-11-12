package com.paopao.mycloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

	// @Value("${casServerUrlPrefix}")
	// private String casServerUrlPrefix;
	//
	// @Value("${casServerLoginUrl}")
	// private String casServerLoginUrl;
	//
	// @Value("${serverName}")
	// private String serverName;
	//
	// @Value(value = "${cas-ignore-patterns}")
	// private String casIgnorePatterns;

	private static Logger logger = LoggerFactory.getLogger(GatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@GetMapping("test")
	public String test() {
		String id = "asdf";
		return "sessionid: " + id;
	}
	//
	// @Bean
	// public FilterRegistrationBean casSingleSignOutFilter() {
	// FilterRegistrationBean registration = new FilterRegistrationBean();
	// registration.setFilter(new SingleSignOutFilter());
	// registration.addUrlPatterns("/*");
	// registration.addInitParameter("casServerUrlPrefix", casServerUrlPrefix);
	// registration.setName("casSingleSignOutFilter");
	// registration.setOrder(1);
	// return registration;
	// }
	//
	// @Bean
	// public FilterRegistrationBean casAuthenticationFilter() {
	// FilterRegistrationBean registration = new FilterRegistrationBean();
	// registration.setFilter(new AuthenticationFilter());
	// registration.addUrlPatterns("/*");
	// Map<String, String> initParameters = new HashMap<String, String>();
	// initParameters.put("ignorePattern", casIgnorePatterns);
	// registration.setInitParameters(initParameters);
	// registration.addInitParameter("casServerLoginUrl", casServerLoginUrl);
	// registration.addInitParameter("serverName", serverName);
	// registration.setName("casAuthenticationFilter");
	// registration.setOrder(2);
	// return registration;
	// }
	//
	// @Bean
	// public FilterRegistrationBean casValidationFilter() {
	// FilterRegistrationBean registration = new FilterRegistrationBean();
	// registration.setFilter(new Cas30ProxyReceivingTicketValidationFilter());
	// registration.addUrlPatterns("/*");
	// registration.addInitParameter("casServerUrlPrefix", casServerUrlPrefix);
	// registration.addInitParameter("serverName", serverName);
	// registration.addInitParameter("redirectAfterValidation", "true");
	// registration.addInitParameter("useSession", "true");
	// registration.addInitParameter("authn_method", "mfa-duo");
	// registration.setName("casValidationFilter");
	// registration.setOrder(3);
	// return registration;
	// }
	//
	// @Bean
	// public FilterRegistrationBean casHttpServletRequestWrapperFilter() {
	// FilterRegistrationBean registration = new FilterRegistrationBean();
	// registration.setFilter(new HttpServletRequestWrapperFilter());
	// registration.addUrlPatterns("/*");
	// registration.setName("casHttpServletRequestWrapperFilter");
	// registration.setOrder(4);
	// return registration;
	// }
	//
	// @Bean
	// public ServletListenerRegistrationBean<EventListener>
	// getSingleSignOutHttpSessionListener() {
	// ServletListenerRegistrationBean<EventListener> registrationBean = new
	// ServletListenerRegistrationBean<>();
	// registrationBean.setListener(new SingleSignOutHttpSessionListener());
	// return registrationBean;
	// }
}
