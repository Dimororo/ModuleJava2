import collectionsss.MyArrayList;
import java.util.Scanner;
import jdbcs.DataBase;
import threadssss.Ping;

public class Main {

    public static void main(String[] args) {
        System.out.println("What u want 2 test?");
        System.out.println("1. Collections & Generics;");
        System.out.println("2. Multi-Theading;");
        System.out.println("3. JDBC.");
        Scanner scanner = new Scanner(System.in);
        choose(scanner.nextInt());

    }

    private static void choose(int in) {
        switch (in) {
            case 1:
                collectionsGenerics();
                break;
            case 2:
                multiTheading();
                break;
            case 3:
                jdbc();
                break;
            default:
                System.out.println("Try to choose another");
                Scanner scanner = new Scanner(System.in);
                choose(scanner.nextInt());

        }
    }

    private static void collectionsGenerics() {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("something");
        myArrayList.add(32);
        System.out.println(myArrayList.intAdd("lol"));
        myArrayList.remove(3);

    }

    private static void multiTheading() {
        Ping ping = new Ping();
        ping.run();
    }

    private static void jdbc() {

        DataBase dataBase = new DataBase();
        dataBase.createDbUserTable();
        dataBase.readAllLines();

    }
}
