package top.sxuet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: Spring5
 * @description: 配置类——完全注解开发
 * @author: Sxuet
 * @create: 2021-07-02 18:33
 */
@Configuration
@ComponentScan(basePackages = "top.sxuet")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AOPConfig {}
