package rx.example.com;

/**
 * @auth hc
 * @data
 */
public class Test {
  public static class SingleToHolder {
      private static final Test ourInstance = new Test();
  }

  public static Test getInstance() {
      return SingleToHolder.ourInstance;
  }

      private Test() {
  }


}
