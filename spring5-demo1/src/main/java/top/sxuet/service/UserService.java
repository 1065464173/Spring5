package top.sxuet.service;

import top.sxuet.dao.UserDao;
import top.sxuet.dao.UserDaoImpl;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 16:47
 */
public class UserService {

  private UserDao userDao;

  public UserService() {}

  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public void add() {
    System.out.println("service add");

    // 原始方式
    UserDao userDao = new UserDaoImpl();
    userDao.update();

    // 注入方式
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }
}
