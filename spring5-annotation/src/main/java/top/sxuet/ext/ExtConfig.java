package top.sxuet.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.sxuet.bean.Color;

/**
 * @program: Spring5
 * @description: 其他扩展工作原理
 * @author: Sxuet
 * @create: 2021-07-07 21:11
 */
@ComponentScan(value = "top.sxuet.ext")
@Configuration
public class ExtConfig {
  @Bean
  public Color color() {
    return new Color();
  }
}
