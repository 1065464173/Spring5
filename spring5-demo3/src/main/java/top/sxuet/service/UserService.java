package top.sxuet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.sxuet.dao.UserDao;

/**
 * @program: Spring5
 * @description: value 里面的值不写的话默认值为类名首字母小写
 * @author: Sxuet
 * @create: 2021-07-02 13:02
 */
@Service // (value = "userService")
public class UserService {
  public UserDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** 定义dao属性 不需要添加set方法，添加属性注解即可 autowried 根据类型进行自动装配 */
  @Autowired // 根据类型注入
  @Qualifier(value = "userDaoImpl") // 根据名称注入，要搭配autowired使用
  private UserDao userDao;

  //  @Resource(name = "userDaoImpl")
  //  private UserDao userDao;

  @Value(value = "abc")
  private String name;

  public void add() {
    System.out.println("service add..");
    userDao.add();
  }
}
