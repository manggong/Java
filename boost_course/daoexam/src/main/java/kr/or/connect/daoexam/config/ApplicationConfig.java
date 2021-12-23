package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "kr.or.connect.daoexam.dao"})
@Import({DBConfig.class})	 // 설정파일을 여러개로 나눔.
public class ApplicationConfig {
	

}
