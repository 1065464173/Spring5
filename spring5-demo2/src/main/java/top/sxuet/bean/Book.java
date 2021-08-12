package top.sxuet.bean;

import java.util.List;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 20:35
 */
public class Book {
  private List<String> list;

  public Book() {}

  public List<String> getList() {
    return list;
  }

  @Override
  public String toString() {
    return "Book{" + "list=" + list + '}';
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public Book(List<String> list) {
    this.list = list;
  }
}
