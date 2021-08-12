package top.sxuet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.sxuet.bean.Car;
import top.sxuet.bean.Cat;
import top.sxuet.bean.Dog;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 20:29
 */
@Configuration
@ComponentScan(value = "top.sxuet")
public class MainConfigOfLifeCycle {
  @Bean(initMethod = "init", destroyMethod = "destroy")
  public Car car() {
    return new Car();
  }

  @Bean
  public Cat cat() {
    return new Cat();
  }

  @Bean
  public Dog dog() {
    return new Dog();
  }
}
