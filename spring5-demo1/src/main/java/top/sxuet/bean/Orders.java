package top.sxuet.bean;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 15:42
 */
public class Orders {
  private String oname;
  private String address;

  public Orders(String oname, String address) {
    this.oname = oname;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Orders{" + "oname='" + oname + '\'' + ", address='" + address + '\'' + '}';
  }
}
