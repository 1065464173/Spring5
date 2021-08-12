package top.sxuet.aopanno;

import org.springframework.stereotype.Component;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 17:44
 */
@Component
public class User {
  public void add() {
    System.out.println("user add..");
  }
}
