package top.sxuet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.sxuet.dao.UserTableDao;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 21:04
 */
@Service
@Transactional(
    readOnly = false,
    propagation = Propagation.REQUIRED,
    isolation = Isolation.REPEATABLE_READ)
public class UserTableService {
  @Autowired private UserTableDao userTableDao;

  /** 转账方法 */
  public void transfer() {
    try {
      userTableDao.addMoney();
      int i = 10 / 0;
      userTableDao.reduceMoney();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
