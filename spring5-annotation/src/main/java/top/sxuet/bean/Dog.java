package top.sxuet.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 21:07
 */
public class Dog {
  public Dog() {
    System.out.println("Dog constructor..");
  }

  /** 对象创建完成并赋值完成调用 */
  @PostConstruct
  public void init() {
    System.out.println("Dog @PostConstruct..");
  }

  /** 容器销毁之前通知我们进行清理工作 */
  @PreDestroy
  public void destroy() {
    System.out.println("Dog @PreDestroy");
  }
}
