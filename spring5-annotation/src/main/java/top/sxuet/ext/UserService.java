package top.sxuet.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-08 12:45
 */
@Service
public class UserService {
  @EventListener(classes = ApplicationEvent.class)
  public void listen(ApplicationEvent event) {
    System.out.println("UserService..监听事件");
  }
}
