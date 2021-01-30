package org.example;

public class App {
    public static void main(String[] args) {

        CircularList circularList = new CircularList();
        circularList.add(1, 18);
        circularList.add(3, 30);
        circularList.add(5, 6);
        circularList.add(-25, 0);
        circularList.add(99, 3);

        circularList.display();
        System.out.println("");

        circularList.displayPolynomial();
        circularList.deleteLast();
        System.out.println("wywołanie metody: circularList.deleteLast();");
//        circularList.deleteLast();
//        circularList.deleteLast();
//        circularList.display();
//        circularList.displayLast();
        circularList.displayPolynomial();

    }
}
