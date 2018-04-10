package demon.my;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
//mybatis扫描对应package为mapper接口生成代理类配置
@MapperScan("demon.my.dao")
public class Application {
	
	@RequestMapping("/")
	public String greeting() {
		return "Spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
