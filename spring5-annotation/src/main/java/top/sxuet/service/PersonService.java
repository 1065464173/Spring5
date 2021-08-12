package top.sxuet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.sxuet.dao.PersonDao;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 18:15
 */
@Service
public class PersonService {
  @Qualifier("personDaoImpl")
  @Autowired
  private PersonDao personDao;

  public void print() {
    System.out.println(personDao);
  }
}
