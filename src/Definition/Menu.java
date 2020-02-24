package Definition;

import Helper_Methods.Person;

import java.util.Scanner;

public class Menu {

    private MyLinkedList<Person> linkedList;
    private Scanner scan;

    public Menu() {
        scan = new Scanner(System.in);
        linkedList = new MyLinkedList<>();
    }
}
