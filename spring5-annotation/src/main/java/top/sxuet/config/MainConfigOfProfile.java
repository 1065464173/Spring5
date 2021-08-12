package top.sxuet.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import top.sxuet.bean.Red;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 20:38
 */
@Configuration
@PropertySource("classpath:druid.properties")
public class MainConfigOfProfile {

  @Value("${username}")
  private String username;

  @Value("${password}")
  private String password;

  @Value("${driverClassName}")
  private String driverClassName;

  @Value("${url}")
  private String url;

  private DruidDataSource dataSource = null;
  /**
   * 测试环境连接池
   *
   * @return
   */
  @Profile("test")
  @Bean("testDataSource")
  public DruidDataSource druidDataSourceTest() {
    dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driverClassName);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);

    return dataSource;
  }

  /**
   * 开发环境连接池
   *
   * @return
   */
  @Profile("dev")
  @Bean("devDataSource")
  public DruidDataSource druidDataSourceDev() {
    dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driverClassName);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);

    return dataSource;
  }

  /**
   * 生产环境连接池
   *
   * @return
   */
  @Profile("prod")
  @Bean("prodDataSource")
  public DruidDataSource druidDataSourceProd() {
    dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driverClassName);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);

    return dataSource;
  }

  @Bean
  @Profile("default") // 默认激活环境
  public Red red() {
    return new Red();
  }
}
