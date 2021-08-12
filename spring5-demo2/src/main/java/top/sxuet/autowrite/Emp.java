package top.sxuet.autowrite;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 22:47
 */
public class Emp {
  private Dept dept;

  public Emp() {}

  @Override
  public String toString() {
    return "Emp{" + "dept=" + dept + '}';
  }

  public Dept getDept() {
    return dept;
  }

  public void setDept(Dept dept) {
    this.dept = dept;
  }

  public void show() {
    System.out.println(dept);
  }
}
