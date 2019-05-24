package net.lip.spring;

public class HelloMoon implements IHelloMessage {

    @Override
    public String sayHello() {
        return "Hello Moon！";
    }

}
