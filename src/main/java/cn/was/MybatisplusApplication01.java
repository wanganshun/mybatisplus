package cn.was;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@MapperScan("cn.was.mapper")
public class MybatisplusApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication01.class, args);
    }

}
