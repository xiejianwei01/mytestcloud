
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConfigClient_3355_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
	}
}
