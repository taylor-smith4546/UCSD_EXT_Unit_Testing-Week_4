# UCSD Extension: Unit Testing: Supporting Modern Software Development Methods

## Videos: 

[Lecture 4: Mocks, Stubs and Test Spies](URL link here)

## Assignment/Classwork:

Quiz #4 (Blackboard)

Exercise #1:

User Service Tested

Write a happy-path test for the class presented below. Verify that the user gets his new password, and
that the updateUser() method of userDAO is called.

```java
public class UserServiceImpl {
 private UserDAO userDAO;
 private SecurityService securityService;
 public void assignPassword(User user) throws Exception {
 String passwordMd5 = securityService.md5(user.getPassword());
 user.setPassword(passwordMd5);
 userDAO.updateUser(user);
 }
 public UserServiceImpl(UserDAO dao, SecurityService security) {
 this.userDAO = dao;
 this.securityService = security;
 }
}
```

## Topics Covered: 

o	Introducing Mockito

o	Types of Test Double

o	Putting it all together
