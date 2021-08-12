package top.sxuet.dao;

import org.springframework.stereotype.Controller;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 13:32
 */
@Controller(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
  @Override
  public void add() {
    System.out.println("impl add..");
  }
}
