package service;

import dao.TestDao;

public class TestServiceBImpl implements TestServiceB{
    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }


    public void sayHello(){
        System.out.println("Setter DI");
        testDao.sayHello();
    }
}
