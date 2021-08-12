package top.sxuet.factory;

import top.sxuet.dao.UserDao;
import top.sxuet.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 15:46
 */
public class JDKProxy {
  public Object getInstance() {
    UserDao o =
        (UserDao)
            Proxy.newProxyInstance(
                JDKProxy.class.getClassLoader(),
                new Class[] {UserDao.class},
                new UserDaoProxy(new UserDaoImpl()));
    //    UserDao userDao = (UserDao) o;
    //    System.out.println(userDao.add(1, 2));
    return o;
  }
}

class UserDaoProxy implements InvocationHandler {
  private Object obj;

  public UserDaoProxy(Object obj) {
    this.obj = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 方法执行之前
    System.out.println("方法之前执行" + method.getName() + "传递参数" + Arrays.toString(args));
    // 方法执行
    Object res = method.invoke(obj, args);
    // 方法执行之后
    System.out.println("方法执行完毕" + obj + "返回结果为" + res);
    return res;
  }
}
