import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import top.sxuet.entity.User;
import top.sxuet.service.UserService;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 19:47
 */
public class TestDemo {
  ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
  UserService userService = context.getBean("userService", UserService.class);
  @Autowired private JdbcTemplate jdbcTemplate;
  /** 测试jdbcTemplate 增删改的方法 */
  @Test
  public void test01() {
    User user = new User(10, "sxuet", "123456", "china", "137xxxx5855");
    //    userService.addUser(user);
    user.setName("sss");
    userService.update(user);
    userService.delete(11);
  }

  /** 查询count操作测试 */
  @Test
  public void test02() {
    int count = userService.count();
    System.out.println(count);
  }

  /** 查询操作测试 */
  @Test
  public void test03() {
    User user = userService.find(1);
    System.out.println(user);
    List<User> all = userService.findAll();
    all.forEach(System.out::println);
  }

  /** 批量添加测试 */
  @Test
  public void test04() {
    List<Object[]> list = new ArrayList<>();
    list.add(new Object[] {"1", "2", "3", "4"});
    list.add(new Object[] {"1", "2", "3", "4"});
    list.add(new Object[] {"1", "2", "3", "4"});
    userService.batchAdd(list);
    List<User> all = userService.findAll();
    all.forEach(System.out::println);
  }

  /** 批量修改操作 */
  @Test
  public void test05() {
    List<Object[]> list = new ArrayList<>();
    list.add(new Object[] {"5", "5", "5", "5", "14"});
    list.add(new Object[] {"5", "5", "5", "5", "15"});
    list.add(new Object[] {"5", "5", "5", "5", "16"});
    userService.batchUpdate(list);
    List<User> all = userService.findAll();
    all.forEach(System.out::println);
  }

  /** 批量删除 */
  @Test
  public void test06() {
    List<Object[]> list = new ArrayList<>();
    list.add(new Object[] {"14"});
    list.add(new Object[] {"15"});
    list.add(new Object[] {"16"});
    userService.batchDelete(list);
    List<User> all = userService.findAll();
    all.forEach(System.out::println);
  }

  @Test
  public void test() {
    DataOutputStream dos = null;
    try {
      dos = new DataOutputStream(new FileOutputStream("t.dat"));
      dos.writeUTF("oh");
      //            dos.writeDouble(5.5);
      //      dos.writeInt(1234);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (dos != null) {
          dos.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
