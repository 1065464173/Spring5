package top.sxuet.bean;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 16:34
 */
public class Person {
  /** 使用@value赋值：1、基本类型。2、可以写SpEL(spring表达式)：#{}.3、使用${},取出配置文件的值 */
  //  @Value("Sxuet")
  private String name;

  //  @Value("#{20-2}")
  private Integer age;

  //  @Value("${person.nickName}")
  private String nickName;

  public Person() {}

  public Person(String name, Integer age, String nickName) {
    this.name = name;
    this.age = age;
    this.nickName = nickName;
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{"
        + "name='"
        + name
        + '\''
        + ", age="
        + age
        + ", nickName='"
        + nickName
        + '\''
        + '}';
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
