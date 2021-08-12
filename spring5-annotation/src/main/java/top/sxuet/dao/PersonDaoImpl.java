package top.sxuet.dao;

import org.springframework.stereotype.Repository;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 18:15
 */
@Repository
public class PersonDaoImpl implements PersonDao {
  private int lable = 1;

  public int getLable() {
    return lable;
  }

  public void setLable(int lable) {
    this.lable = lable;
  }

  @Override
  public String toString() {
    return "PersonDaoImpl{" + "lable=" + lable + '}';
  }
}
