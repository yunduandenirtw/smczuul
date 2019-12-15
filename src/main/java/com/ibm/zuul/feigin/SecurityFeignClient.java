package com.ibm.zuul.feigin;

/**
 * @ClassName CompanyController
 * @Description TODO
 * @Author WangRuiTing
 * @Date 12/10/2019 6:00 PM
 * @Version 1.0
 **/
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.zuul.bean.ResponseBean;

@FeignClient(name = "users-service")
public interface SecurityFeignClient {
	
    // verify admin role
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    ResponseEntity<ResponseBean> isAdmin(@RequestHeader(name = "authorization") String authHeader);

    // verify token
    @RequestMapping(value = "/authenticated", method = RequestMethod.GET)
    ResponseEntity<ResponseBean> hasToken(@RequestHeader(name = "authorization") String authHeader);

}
