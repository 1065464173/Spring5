package top.sxuet.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 19:43
 */
public class MyImportSelector implements ImportSelector {

  /**
   * 返回值就是导入容器中的组件全类名
   *
   * @param importingClassMetadata 当前标注@import注解类的所有注解信息
   * @return
   */
  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    // 可以返回空数组，但是不能返回null
    // 返回注册组件名
    return new String[] {"top.sxuet.bean.Blue", "top.sxuet.bean.Red"};
  }

  @Override
  public Predicate<String> getExclusionFilter() {
    return ImportSelector.super.getExclusionFilter();
  }
}
