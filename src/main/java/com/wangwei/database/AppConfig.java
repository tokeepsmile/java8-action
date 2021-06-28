package com.wangwei.database;

import com.wangwei.database.service.StudentService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wangwei
 * @date 2021-06-24 13:22
 * @since 1.0
 */

@Configuration
@ComponentScan(basePackages = "com.wangwei.database")
@MapperScan(basePackages = "com.wangwei.database.mapper")
@Import({JdbcConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// @EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class AppConfig {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.saveStudent("小明");
    }
}
