package top.sxuet.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 18:18
 */
@Component
@Aspect
@Order(3)
public class PersonProxy {

  @Before("execution(* top.sxuet.aopanno.User.add())")
  public void before() {
    System.out.println(" person ");
  }
}
