package top.sxuet.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.sxuet.autowrite.Emp;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 20:48
 */
public class TestDemo {
  /** factoryBean测试 */
  @Test
  public void test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
    //    MyBean myBean = context.getBean("myBean", MyBean.class);
    Course course = context.getBean("myBean", Course.class);
    System.out.println(course);
  }

  /** bean默认单实例 设置scope为多实例后可以获取不同的实例 */
  @Test
  public void test02() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    Book book1 = context.getBean("book", Book.class);
    Book book2 = context.getBean("book", Book.class);
    System.out.println(book1 == book2);
  }

  /** Bean的生命周期——共七步 */
  @Test
  public void test03() {
    //    ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
    Orders orders = context.getBean("orders", Orders.class);
    System.out.println("第四步，获取bean实例" + orders);
    context.close();
  }

  /** 自动装配 */
  @Test
  public void test04() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
    Emp emp = context.getBean("emp", Emp.class);
    System.out.println(emp);
  }
}
