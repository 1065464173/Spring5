package top.sxuet.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 22:36
 */
public class MyBeanPost implements BeanPostProcessor {
  /**
   * 初始化
   *
   * @param bean
   * @param beanName
   * @return
   * @throws BeansException
   */
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("初始化执行之前执行的方法");

    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("初始化执行之后执行的方法");
    return bean;
  }
}
