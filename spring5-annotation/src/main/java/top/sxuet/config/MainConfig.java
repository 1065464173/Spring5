package top.sxuet.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import top.sxuet.bean.Color;
import top.sxuet.bean.ColorFactoryBean;
import top.sxuet.bean.Person;
import top.sxuet.condition.MacCondition;
import top.sxuet.condition.MyImportBeanSelector;
import top.sxuet.condition.MyImportSelector;
import top.sxuet.condition.WindowsCondition;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 16:35
 */
@Configuration // 配置类
// 指明扫描包
@ComponentScan(
    value = "top.sxuet.dao",
    // 排除格式为注解，值为controller和service
    excludeFilters = {
      @ComponentScan.Filter(
          type = FilterType.ANNOTATION,
          classes = {Controller.class, Service.class})
    })
// excludeFilters 排除
// includeFilters 只包含 —— useDefaultLFilter = false
// import快速导入组件，id 默认是全类名
@Import({Color.class, MyImportSelector.class, MyImportBeanSelector.class})
public class MainConfig {
  /**
   * 注册类型为返回值类型，id默认是方法名 @Lazy lazy 懒汉式懒加载 Scope —— 单实例？多实例？
   *
   * @return Person
   */
  @Bean("person1")
  //  @Scope("protoType")
  @Lazy
  public Person person() {
    System.out.println("i'm a lazy person");
    return new Person("lucy", 20);
  }

  /**
   * Conditional(WindowsCondition.class) 如果是windows操作系统，就在ioc容器中添加bill对象
   *
   * @return
   */
  @Bean("bill")
  @Conditional(WindowsCondition.class)
  public Person person01() {
    return new Person("Bill Gates", 62);
  }

  /**
   * Conditional(WindowsCondition.class) 如果是mac操作系统，就在ioc容器中添加candy对象
   *
   * @return
   */
  @Bean("Candy")
  @Conditional(MacCondition.class)
  public Person person02() {
    System.out.println("hello im candy");
    return new Person("Candy", 22);
  }

  @Bean
  public ColorFactoryBean colorFactoryBean() {
    return new ColorFactoryBean();
  }
}
