package meetup.app;

import java.util.ServiceLoader;

import meetup.hello.Service;
// import meetup.internal.hello.ServiceImpl;

public class App {

  public static void main(final String[] args) {
    ServiceLoader<Service> locator = ServiceLoader.load(Service.class);
    // uncomment to see compile time error
    // ServiceImpl impl = new ServiceImpl();
    Service service = locator.iterator().next();
    System.out.println(service.sayHi("Java Meetup"));
  }

}
