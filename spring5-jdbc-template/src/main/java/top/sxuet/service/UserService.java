package top.sxuet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sxuet.dao.UserDao;
import top.sxuet.entity.User;

import java.util.List;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 19:41
 */
@Service
public class UserService {
  @Autowired private UserDao userDao;

  /**
   * 添加
   *
   * @param user
   * @return
   */
  public int addUser(User user) {
    return userDao.add(user);
  }

  /**
   * 修改
   *
   * @param user
   * @return
   */
  public int update(User user) {
    return userDao.updateUser(user);
  }

  /**
   * 删除
   *
   * @param id
   * @return
   */
  public int delete(int id) {
    return userDao.delete(id);
  }

  public int delete(User user) {
    return userDao.delete(user.getId());
  }

  public int count() {
    return userDao.getCount();
  }

  public User find(int id) {
    return userDao.findById(id);
  }

  public List<User> findAll() {
    return userDao.findAll();
  }

  /**
   * 批量添加
   *
   * @param batchArgs
   */
  public void batchAdd(List<Object[]> batchArgs) {

    userDao.batchAddUser(batchArgs);
  }

  /**
   * 批量修改
   *
   * @param batchArgs
   */
  public void batchUpdate(List<Object[]> batchArgs) {

    userDao.batchUpate(batchArgs);
  }
  /**
   * 批量删除
   *
   * @param batchArgs
   */
  public void batchDelete(List<Object[]> batchArgs) {

    userDao.batchDelete(batchArgs);
  }
}
