package MyExceptionPractice;

public class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message);
    }

    public void MyCheckedException(String message) throws MyCheckedException{

        throw new MyCheckedException("This is MyException");

    }

}
