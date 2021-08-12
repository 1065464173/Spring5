package top.sxuet.dao;

import org.springframework.stereotype.Repository;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 21:02
 */
@Repository
public interface UserTableDao {
  void addMoney();

  void reduceMoney();
}
