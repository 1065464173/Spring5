package top.sxuet.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-08 11:59
 */
@Component
public class MyApplicationListener implements ApplicationListener {

  /**
   * 容器中发布此事件以后，方法触发
   *
   * @param event
   */
  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    System.out.println("收到事件：" + event);
  }
}
