module meetup.hello {

  exports meetup.hello;

  provides meetup.hello.Service
      with meetup.internal.hello.ServiceImpl;
}
