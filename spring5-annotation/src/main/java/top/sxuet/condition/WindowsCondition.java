package top.sxuet.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 18:45
 */
public class WindowsCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    // 获取ioc容器的beanFactory
    ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
    // 获取类加载器
    ClassLoader classLoader = context.getClassLoader();
    // 获取当前环境信息
    Environment environment = context.getEnvironment();
    // 获取bean定义的注册类
    BeanDefinitionRegistry registry = context.getRegistry();
    //    if (registry.containsBeanDefinition("person")) {
    //      return true;
    //    }

    String property = environment.getProperty("os.name");
    if (property.contains("Windows")) {
      return true;
    }
    return false;
  }
}
