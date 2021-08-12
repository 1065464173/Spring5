package top.sxuet.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-07 21:15
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  /**
   * 所有的bean定义好后，尚未初始化的时候调用一下方法
   *
   * @param beanFactory
   * @throws BeansException
   */
  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    System.out.println("MyBeanFactoryPostProcessor..postProcessBeanFactory");
    int count = beanFactory.getBeanDefinitionCount();
    String[] names = beanFactory.getBeanDefinitionNames();
    System.out.println("当前beanFactory中有" + count + "个bean");
    System.out.println(Arrays.toString(names));
  }
}
