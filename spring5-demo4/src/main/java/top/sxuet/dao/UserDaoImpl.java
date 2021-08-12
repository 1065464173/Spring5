package top.sxuet.dao;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 15:44
 */
public class UserDaoImpl implements UserDao {

  @Override
  public int add(int a, int b) {
    return a + b;
  }

  @Override
  public String update(String id) {
    return id;
  }
}
