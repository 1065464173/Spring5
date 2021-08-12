package top.sxuet.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 20:12
 */
public class ColorFactoryBean implements FactoryBean<Color> {

  /**
   * 返回一个color对象，这个对象会添加到容器里
   *
   * @return
   * @throws Exception
   */
  @Override
  public Color getObject() throws Exception {
    System.out.println("ColorFactoryBean get object..");
    return new Color();
  }

  /**
   * 返回color类型
   *
   * @return
   */
  @Override
  public Class<?> getObjectType() {
    return Color.class;
  }

  /**
   * 是否单例
   *
   * @return true —— 容器中只存在一个bean
   */
  @Override
  public boolean isSingleton() {
    return FactoryBean.super.isSingleton();
  }
}
