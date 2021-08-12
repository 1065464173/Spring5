package top.sxuet.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-05 18:18
 */
// Aspect告诉spring 这是一个切面类
@Aspect
public class LogAspects {
  @Pointcut("execution(public int top.sxuet.aop.MathCalculator.*(..))")
  public void pointCut() {}
  /** Before前置通知目标方法之前切入 */
  @Before("pointCut()")
  public void logStart(JoinPoint joinPoint) {
    // 获取参数
    Object[] args = joinPoint.getArgs();
    System.out.println(
        joinPoint.getSignature().getName()
            + "..@before除法运行..参数列表是：{"
            + Arrays.toString(args)
            + "}");
  }
  /** After 后置通知目标方法之后切入 */
  @After("pointCut()")
  public void logEnd(JoinPoint joinPoint) {
    System.out.println(joinPoint.getSignature().getName() + "..@after..除法结束");
  }

  /**
   * AfterReturning返回通知
   *
   * <p>joinPoint 切入点，表示被加强的类或方法 在参数列表必须放在前面，佛则Spring无法识别
   */
  @AfterReturning(value = "pointCut()", returning = "result")
  public void logReturn(JoinPoint joinPoint, Object result) {

    System.out.println(
        joinPoint.getSignature().getName() + "..@AfterReturning..除法正常返回,结果是：{" + result + "}");
  }

  /** 异常通知 */
  @AfterThrowing(value = "pointCut()", throwing = "exception")
  public void logException(JoinPoint joinPoint, Exception exception) {
    System.out.println(
        joinPoint.getSignature().getName() + "..@AfterThrowing..除法异常,异常信息：{" + exception + "}");
  }
}
