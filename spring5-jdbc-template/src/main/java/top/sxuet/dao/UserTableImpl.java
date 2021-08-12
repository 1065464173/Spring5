package top.sxuet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 21:02
 */
@Component
public class UserTableImpl implements UserTableDao {
  @Autowired private JdbcTemplate jdbcTemplate;

  @Override
  public void addMoney() {
    String sql = "update user_table set balance=balance + ? where user = ?";
    jdbcTemplate.update(sql, 100, "AA");
  }

  @Override
  public void reduceMoney() {
    String sql = "update user_table set balance=balance - ? where user = ?";
    jdbcTemplate.update(sql, 100, "BB");
  }
}
