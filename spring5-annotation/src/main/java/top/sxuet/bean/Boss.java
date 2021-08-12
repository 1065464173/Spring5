package top.sxuet.bean;

import org.springframework.stereotype.Repository;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 20:19
 */
@Repository
public class Boss {
  // @Autowired
  private Car car;

  //  @Autowired
  // 只有一个有参构造时，@autoWried可以省略 public Boss(@Autowired  Car car) {
  public Boss(Car car) {
    System.out.println("Boss 有参构造器");
    this.car = car;
  }

  @Override
  public String toString() {
    return "Boss{" + "car=" + car + '}';
  }

  public Car getCar() {
    return car;
  }

  //  @Autowired // 标注方法时，调用方法时会完成赋值
  public void setCar(Car car) {
    this.car = car;
  }
}
