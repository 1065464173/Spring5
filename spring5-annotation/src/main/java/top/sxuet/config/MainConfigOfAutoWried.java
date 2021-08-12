package top.sxuet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.sxuet.dao.PersonDao;
import top.sxuet.dao.PersonDaoImpl;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 19:00
 */
@Configuration
@ComponentScan(value = {"top.sxuet.dao", "top.sxuet.service", "top.sxuet.bean"})
public class MainConfigOfAutoWried {
  @Bean("personDao")
  public PersonDao personDao() {
    PersonDaoImpl personDao = new PersonDaoImpl();
    personDao.setLable(2);
    return personDao;
  }
}
