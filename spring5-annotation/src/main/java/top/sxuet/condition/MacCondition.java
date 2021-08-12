package top.sxuet.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 18:45
 */
public class MacCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    // 获取当前环境信息
    Environment environment = context.getEnvironment();

    String property = environment.getProperty("os.name");
    if (property.contains("Mac")) {
      return true;
    }

    return false;
  }
}
