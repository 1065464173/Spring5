package top.sxuet.bean;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 21:07
 */
public class Orders {
  private String name;

  public Orders() {
    System.out.println("第一步，执行无参构造");
  }

  @Override
  public String toString() {
    return "Orders{" + "name='" + name + '\'' + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("第二步，设置值");
    this.name = name;
  }

  public void initMethod() {
    System.out.println("第三步，执行初始化方法");
  }

  public void destroyMethod() {
    System.out.println("第五步，销毁bean实例");
  }
}
