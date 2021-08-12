package top.sxuet.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;
import top.sxuet.bean.Blue;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-07 21:29
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

  /**
   * Bean定义信息的保存中心
   *
   * <p>BeanFactory 按照BeanDefinitionRegistry里保存的每个bean定义的信息创建bean
   *
   * @param registry
   * @throws BeansException
   */
  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
      throws BeansException {
    System.out.println(
        "MyBeanDefinitionRegistryPostProcessor..postProcessBeanDefinitionRegistry"
            + registry.getBeanDefinitionCount());
    //      RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
    AbstractBeanDefinition beanDefinition =
        BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();
    registry.registerBeanDefinition("hello", beanDefinition);
  }

  /**
   * @param beanFactory
   * @throws BeansException
   */
  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    System.out.println(
        "MyBeanDefinitionRegistryPostProcessor..postProcessBeanFactory"
            + beanFactory.getBeanDefinitionCount());
  }
}
