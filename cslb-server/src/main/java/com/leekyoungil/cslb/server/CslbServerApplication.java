package com.leekyoungil.cslb.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class CslbServerApplication {

    @Autowired
    private Environment environment;

	@RequestMapping("/req-server")
	public String reqTest () {
        String port = environment.getProperty("local.server.port");
        String nowDate = new Date().toString();
        System.out.println(port + " : I'm here! ("+nowDate+")");

		return "status : ok";
	}

	public static void main(String[] args) {
		SpringApplication.run(CslbServerApplication.class, args);
	}
}
