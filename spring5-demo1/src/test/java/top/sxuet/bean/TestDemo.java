package top.sxuet.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 15:46
 */
public class TestDemo {

  /** book-xml 的set注入测试 */
  @Test
  public void testBook() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    Book book = context.getBean("book", Book.class);
    System.out.println(book);
  }

  /** order-xml 的有参构造注入测试 */
  @Test
  public void testOrders() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    Orders orders = context.getBean("orders", Orders.class);
    System.out.println(orders);
  }
}
