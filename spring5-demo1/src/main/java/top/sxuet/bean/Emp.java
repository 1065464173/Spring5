package top.sxuet.bean;

/**
 * @program: spring5
 * @description: 员工类
 * @author: Sxuet
 * @create: 2021-07-01 18:05
 */
public class Emp {
  private String name;
  private String gender;
  private Dept dept;

  public Dept getDept() {
    return dept;
  }

  public void setDept(Dept dept) {
    this.dept = dept;
  }

  @Override
  public String toString() {
    return "Emp{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", dept=" + dept + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
