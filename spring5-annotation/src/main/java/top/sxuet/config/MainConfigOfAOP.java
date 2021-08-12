package top.sxuet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import top.sxuet.aop.LogAspects;
import top.sxuet.aop.MathCalculator;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-05 15:39
 */

/**
 * AOP：[动态代理]
 *
 * <p>逻辑类MathCalculator；
 *
 * <p>日志切面类：LogAspects（包含前置通知，后置通知，返回通知，异常通知，环绕通知：动态代理手动推进目标方法运行）
 */
@Configuration
// 开启基于注解的AOP代理
@EnableAspectJAutoProxy
public class MainConfigOfAOP {
  /** 业务逻辑类 */
  @Bean
  public MathCalculator calculator() {
    return new MathCalculator();
  }

  /** 切面类 */
  @Bean
  public LogAspects logAspects() {
    return new LogAspects();
  }
}
