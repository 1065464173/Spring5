package top.sxuet.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import top.sxuet.bean.RainBow;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 19:51
 */
public class MyImportBeanSelector implements ImportBeanDefinitionRegistrar {
  /**
   * 调用BeanDefinitionRegistry的registerBeanDefinition手动注册方法
   *
   * @param importingClassMetadata 当前注册类信息
   * @param registry BeanDefinitionRegistry 注册类
   * @param importBeanNameGenerator
   */
  @Override
  public void registerBeanDefinitions(
      AnnotationMetadata importingClassMetadata,
      BeanDefinitionRegistry registry,
      BeanNameGenerator importBeanNameGenerator) {

    boolean red = registry.containsBeanDefinition("top.sxuet.bean.Red");
    boolean blue = registry.containsBeanDefinition("top.sxuet.bean.Blue");
    /** 如果两个bean都存在，注册rainbow */
    if (red && blue) {
      registry.registerBeanDefinition("rainBow", new RootBeanDefinition(RainBow.class));
    }

    registerBeanDefinitions(importingClassMetadata, registry);
  }
}
