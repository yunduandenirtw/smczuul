package com.ibm.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CompanyController
 * @Description TODO
 * @Author WangRuiTing
 * @Date 12/10/2019 2:25 PM
 * @Version 1.0
 **/
@Configuration
public class ZuulFilterConfig {
	
	  @Bean
	  public PreFilter preFilter() {
		  return new PreFilter();
	  }

}
