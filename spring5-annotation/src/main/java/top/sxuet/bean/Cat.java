package top.sxuet.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 20:56
 */
public class Cat implements InitializingBean, DisposableBean {
  public Cat() {
    System.out.println("cat constructor.. ");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("cat destroy..");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("car afterPropertiesSet..");
  }
}
