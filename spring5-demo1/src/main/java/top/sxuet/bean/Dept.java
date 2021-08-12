package top.sxuet.bean;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 18:04
 */
public class Dept {
  private String name;

  @Override
  public String toString() {
    return "Dept{" + "name='" + name + '\'' + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
