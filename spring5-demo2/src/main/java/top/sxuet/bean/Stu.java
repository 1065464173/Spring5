package top.sxuet.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 19:20
 */
public class Stu {
  /** 多种集合类型的属性 */
  private String[] courses;

  private List<String> list;
  private Map<String, Integer> maps;
  private Set<String> sets;

  /** 学生的多门课程 */
  private List<Course> courseList;

  public Stu(
      String[] courses,
      List<String> list,
      Map<String, Integer> maps,
      Set<String> sets,
      List<Course> courseList) {
    this.courses = courses;
    this.list = list;
    this.maps = maps;
    this.sets = sets;
    this.courseList = courseList;
  }

  public Stu() {}

  @Override
  public String toString() {
    return "Stu{"
        + "courses="
        + Arrays.toString(courses)
        + ", list="
        + list
        + ", maps="
        + maps
        + ", sets="
        + sets
        + ", courseList="
        + courseList
        + '}';
  }

  public List<Course> getCourseList() {
    return courseList;
  }

  public void setCourseList(List<Course> courseList) {
    this.courseList = courseList;
  }

  public String[] getCourses() {
    return courses;
  }

  public void setCourses(String[] courses) {
    this.courses = courses;
  }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public Map<String, Integer> getMaps() {
    return maps;
  }

  public void setMaps(Map<String, Integer> maps) {
    this.maps = maps;
  }

  public Set<String> getSets() {
    return sets;
  }

  public void setSets(Set<String> sets) {
    this.sets = sets;
  }
}
