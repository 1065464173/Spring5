package top.sxuet.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: Spring5
 * @description: 测试失败，找不到transactionManager 的bean * 可能是因为jdk的版本过于新了
 * @author: Sxuet
 * @create: 2021-07-03 13:08
 */
@Configuration // 配置类
@ComponentScan(basePackages = "top.sxuet") // 组件扫描
@EnableTransactionManagement // 开启事务
public class TxConfig {
  /**
   * 创建数据库连接池
   *
   * @return dataSource
   */
  @Bean
  public DruidDataSource getDruidDataSource() {
    DruidDataSource dataSource = null;
    InputStream is = null;
    System.out.println(System.getProperty("user.dir"));
    try {
      is = ClassLoader.getSystemResourceAsStream("druid.properties");
      Properties properties = new Properties();
      properties.load(is);
      dataSource = new DruidDataSource();
      dataSource.setDriverClassName(properties.getProperty("driverClassName"));
      dataSource.setUrl(properties.getProperty("url"));
      dataSource.setUsername(properties.getProperty("username"));
      dataSource.setPassword(properties.getProperty("password"));

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (is != null) {
          is.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return dataSource;
  }

  /**
   * 创建jdbcTemplate对象
   *
   * @param dataSource
   * @return jdbcTemplate
   */
  @Bean
  public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    // 注入dataSource
    jdbcTemplate.setDataSource(dataSource);
    return jdbcTemplate;
  }

  /**
   * 创建事务管理器对象
   *
   * @param dataSource
   * @return
   */
  @Bean(name = "transactionManager")
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
    transactionManager.setDataSource(dataSource);
    return transactionManager;
  }
}
