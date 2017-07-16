package meetup.internal.hello;

import meetup.hello.Service;

public class ServiceImpl implements Service {

  @Override
  public String sayHi(final String name) {
    return "Hi " + name + "!";
  }

}
