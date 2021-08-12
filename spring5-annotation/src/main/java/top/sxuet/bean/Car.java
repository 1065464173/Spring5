package top.sxuet.bean;

import org.springframework.stereotype.Repository;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 20:32
 */
@Repository
public class Car {
  public Car() {
    System.out.println("car constructor..");
  }

  public void destroy() {
    System.out.println("car destory..");
  }

  public void init() {
    System.out.println("car init..");
  }
}
