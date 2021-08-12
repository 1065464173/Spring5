package top.sxuet.bean;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 20:18
 */
public class Course {
  private String name;

  @Override
  public String toString() {
    return "Course{" + "name='" + name + '\'' + '}';
  }

  public Course() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Course(String name) {
    this.name = name;
  }
}
