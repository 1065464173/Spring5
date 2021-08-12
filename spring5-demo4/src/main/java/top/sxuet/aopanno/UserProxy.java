package top.sxuet.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: Spring5
 * @description: 增强类
 * @author: Sxuet
 * @create: 2021-07-02 17:45
 */
@Component
@Aspect
@Order(2)
public class UserProxy {

  @Pointcut(value = "execution(* top.sxuet.aopanno.User.add())")
  public void userPoint() {}

  /** 前置通知 */
  @Before(value = "userPoint()")
  public void before() {
    System.out.println("before add..");
  }

  /** 后置通知 */
  @After(value = "userPoint()")
  public void after() {
    System.out.println("after add..");
  }

  /** 环绕通知 */
  @Around(value = "userPoint()")
  public void arround(ProceedingJoinPoint proceedingJoinPoint) {
    System.out.println("before around");
    try {
      proceedingJoinPoint.proceed();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    System.out.println("after around");
  }

  /** 异常通知 */
  @AfterThrowing(value = "userPoint()")
  public void afterThrowing() {
    System.out.println("throwing!");
  }

  /** 最终通知 */
  @AfterReturning(value = "userPoint()")
  public void afterReturning() {
    System.out.println("after returning..");
  }
}
