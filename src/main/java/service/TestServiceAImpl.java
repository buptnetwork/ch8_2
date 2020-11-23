package service;
import dao.TestDao;

public class TestServiceAImpl implements TestServiceA {
    private TestDao testDao;

    public TestServiceAImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    public void sayHello(){
        System.out.println("Constructor DI");
        testDao.sayHello();
    }
}
