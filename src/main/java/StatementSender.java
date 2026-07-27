public interface StatementSender {

    void sendStatement(String statementContent);
}


/*
** Exercise 1.1 **

- What should the return type of this method be?
- As what this method does is to print the content, so return type should be void.

- What is the visibility of interface methods? Why?
- As this method is the core functionality of the interface and all classes must override (implement) it, the access modifier should be public.

- Why is this Javadoc important? Think about who we are aiming this javadoc at (i.e. who will read it / benefit from it)?
- It's really helpfull for other developers to understand the purpose of interface and its method, the valid parameters and even return type.

 */