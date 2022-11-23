package Genericc.Generic_Interface;

public class Student<T> implements IDatabase<T>{

    @Override
    public boolean insert(T data) {
        System.out.println("data is added");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("data is deleted");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("data is update");
        return true;
    }

    @Override
    public T select() {
        return null;
    }
}
