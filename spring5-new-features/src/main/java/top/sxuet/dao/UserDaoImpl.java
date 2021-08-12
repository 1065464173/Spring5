package top.sxuet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.sxuet.entity.User;

import java.util.List;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 19:40
 */
@Repository
public class UserDaoImpl implements UserDao {
  /** 类似与dbutil的数据库操作类 */
  @Autowired private JdbcTemplate jdbcTemplate;

  public UserDaoImpl() {}

  public UserDaoImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }

  /**
   * 添加user
   *
   * @param user
   * @return 成功返回1
   */
  @Override
  public int add(User user) {
    String sql = "insert into user(name,password,address,phone) values(?,?,?,?)";
    Object[] args = {user.getName(), user.getPassword(), user.getAddress(), user.getPhone()};
    return jdbcTemplate.update(sql, args);
  }

  /**
   * 修改
   *
   * @param user
   * @return 成功返回1
   */
  @Override
  public int updateUser(User user) {
    String sql = "update  user set name=?,password=?,address=?,phone=? where id = ?";
    Object[] args = {
      user.getName(), user.getPassword(), user.getAddress(), user.getPhone(), user.getId()
    };
    return jdbcTemplate.update(sql, args);
  }

  /**
   * 删除
   *
   * @param id
   * @return 成功返回1
   */
  @Override
  public int delete(int id) {
    String sql = "delete from user where id = ?";
    return jdbcTemplate.update(sql, id);
  }

  /**
   * count*
   *
   * @return
   */
  @Override
  public int getCount() {
    String sql = "select count(*) from user";
    return jdbcTemplate.queryForObject(sql, Integer.class);
  }

  @Override
  public User findById(int id) {
    String sql = "select * from user where id = ?";
    User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    return user;
  }

  @Override
  public List<User> findAll() {
    String sql = "select * from user";
    List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    return users;
  }

  /**
   * 批量添加
   *
   * @param batchArgs
   */
  @Override
  public void batchAddUser(List<Object[]> batchArgs) {
    String sql = "insert into user(name,password,address,phone) values(?,?,?,?)";
    jdbcTemplate.batchUpdate(sql, batchArgs);
  }

  /**
   * 批量修改
   *
   * @param batchArgs
   */
  @Override
  public void batchUpate(List<Object[]> batchArgs) {
    String sql = "update  user set name=?,password=?,address=?,phone=? where id = ?";
    jdbcTemplate.batchUpdate(sql, batchArgs);
  }

  @Override
  public void batchDelete(List<Object[]> batchArgs) {
    String sql = "delete from user where id = ?";
    jdbcTemplate.batchUpdate(sql, batchArgs);
  }
}
