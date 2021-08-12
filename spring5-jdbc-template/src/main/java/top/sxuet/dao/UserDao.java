package top.sxuet.dao;

import top.sxuet.entity.User;

import java.util.List;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 19:39
 */
public interface UserDao {
  /**
   * 添加一个用户
   *
   * @param user
   */
  int add(User user);

  /**
   * 修改一个用户的信息
   *
   * @param user
   */
  int updateUser(User user);

  /**
   * 根据id删除一个用户信息
   *
   * @param id
   */
  int delete(int id);

  /**
   * 返回count(*)
   *
   * @return
   */
  int getCount();

  /**
   * 根据id查找用户
   *
   * @param id
   * @return
   */
  User findById(int id);

  /**
   * 查找表内所有对象
   *
   * @return
   */
  List<User> findAll();

  /**
   * 批量添加user
   *
   * @param batchArgs
   */
  void batchAddUser(List<Object[]> batchArgs);

  /**
   * 批量修改
   *
   * @param batchArgs
   */
  void batchUpate(List<Object[]> batchArgs);

  void batchDelete(List<Object[]> batchArgs);
}
