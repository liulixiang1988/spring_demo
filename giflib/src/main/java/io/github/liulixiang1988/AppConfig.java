package io.github.liulixiang1988;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration //自动配置
@ComponentScan //扫描控制器
public class AppConfig {
    public static void main(String[] args){
        SpringApplication.run(AppConfig.class, args);
    }
}
