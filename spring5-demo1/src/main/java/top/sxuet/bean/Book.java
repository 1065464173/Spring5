package top.sxuet.bean;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 15:20
 */
public class Book {
  private String name;
  private String bauthor;
  private String address;
  private String desc;
  
  public String getDesc() {
    return desc;
  }
  
  public void setDesc(String desc) {
    this.desc = desc;
  }
  
  @Override
  public String toString() {
    return "Book{" +
            "name='" + name + '\'' +
            ", bauthor='" + bauthor + '\'' +
            ", address='" + address + '\'' +
            ", desc='" + desc + '\'' +
            '}';
  }
  
  public Book(String name, String bauthor) {
    this.name = name;
    this.bauthor = bauthor;
  }

  private Book() {}

  /**
   * 使用有参构造注入name属性
   *
   * @param name
   */
  public Book(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getBauthor() {
    return bauthor;
  }

  public void setBauthor(String bauthor) {
    this.bauthor = bauthor;
  }

  public String getName() {
    return name;
  }

  /**
   * 使用set方法注入属性
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }
}
