package ch09.sec09.write_objects;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", 21);
        Person p2 = new Person("Jane", 18);
        Person p3 = new Person("Sam", 23);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.doc"))) {
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.doc"))){
            Person personFromFile = (Person) ois.readObject();
            Person personFromFile2 = (Person) ois.readObject();
            Person personFromFile3 = (Person) ois.readObject();
            System.out.println(personFromFile);
            System.out.println(personFromFile2);
            System.out.println(personFromFile3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
