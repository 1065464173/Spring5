package top.sxuet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import top.sxuet.bean.Person;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 18:42
 */
@Configuration
@PropertySource(value = {"classpath:person.properties"})
public class MainConfigOfPropertyValues {

  @Bean
  public Person person() {
    return new Person();
  }
}
