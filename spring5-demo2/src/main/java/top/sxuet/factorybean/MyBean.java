package top.sxuet.factorybean;

import org.springframework.beans.factory.FactoryBean;
import top.sxuet.bean.Course;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 20:47
 */
public class MyBean implements FactoryBean<Course> {

  @Override
  public Course getObject() throws Exception {
    return new Course("java");
  }

  @Override
  public Class<?> getObjectType() {
    return null;
  }
}
