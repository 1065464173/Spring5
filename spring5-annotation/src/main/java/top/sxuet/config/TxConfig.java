package top.sxuet.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-07 20:16
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(value = {"top.sxuet.dao", "top.sxuet.service"})
@PropertySource("classpath:druid.properties")
public class TxConfig {
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
   * 数据源
   *
   * @return
   */
  @Bean
  public DruidDataSource druidDataSource() {
    dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driverClassName);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {

    return new JdbcTemplate(dataSource);
  }

  /**
   * 注册数据管理器
   *
   * @param dataSource
   * @return
   */
  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }
}
