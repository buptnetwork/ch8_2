import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestServiceA;
import service.TestServiceB;

public class Test {
  public static void main(String[] args){
      ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
      TestServiceA testServiceA = (TestServiceA)appCon.getBean("mytestServiceA");
      testServiceA.sayHello();
      System.out.println("***********************");
      TestServiceB testServiceB = (TestServiceB)appCon.getBean("mytestServiceB");
      testServiceB.sayHello();
      System.out.println(testServiceB);

      TestServiceB testServiceB2 = (TestServiceB)appCon.getBean("mytestServiceB");
      testServiceB2.sayHello();
      System.out.println(testServiceB2);
  }
}
