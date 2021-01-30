package org.example;

public class CircularList {
    public Node head = null;

    /**
     * Konstruktor ktory ustawia pierwszy element,
     * i ustawia noda na siebie samego
     */
    public CircularList() {
        head = new Node(0, -1);
        head.setNext(head);

    }

    /**
     * metoda dodajaca nowy element do listy
     *
     * @param value1 - wspolczynnik
     * @param value2 - wykladnik potegi
     */
    public void add(int value1, int value2) {
        Node newNode = new Node(value1, value2);
        if (head == null) {
            head = new Node(0, -1);
            head.setNext(head);
        }
        newNode.setNext(head.getNext());
        head.setNext(newNode);
        head = newNode;
    }

    /**
     * usuwa ostatni element listy
     */
    public void deleteLast() {
        if (head == null) {
            System.out.println("lista nieprawidlowo zainicjalizowana");
            return;
        }
        if (head == head.getNext() && head.getValue1() == 0 && head.getValue2() == -1) {
            System.out.println("lista bez wielomianu");
            return;
        }
        Node last = getLast();
        Node current = head.getNext();
        {
            while (!(current.getNext() == (last))) {
                current = current.getNext();
            }
        }
        current.setNext(head);
    }

    /**
     * wyświetla ostatni element na liscie
     */
    public void displayLast() {
        if (head.getNext() == head) {
            System.out.println("lista jest pusta");
        } else {
            System.out.println(head.toString());
            }
        }

    /**
     * metoda zwroca ostatni element na liscie
     *
     * @return Node - ostatni w liscie
     */
    public Node getLast() {
        Node current = head;
        if (head.getNext() == head) {
            System.out.println("lista jest pusta");
        } else {
            while (!(current.getNext() == (head))) {
                current = current.getNext();
            }
        }
        return current;
    }

    /**
     * wyświetla liste elementow (każdy node) znajdujacych sie w liscie
     * wyświetla wartości node oraz wartosci kolejnego noda, na ktorego wskazuje
     */

    public void display() {
        Node current = head;
        System.out.println("Nodes of the CircularList: ");
        do {
            System.out.println(current.getNext().toString());
            current = current.getNext();
        } while (current != head);
    }

    /**
     * wyświetla ciag wielomianu w czytelnym formacie
     */
    public void displayPolynomial() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        do {
            stringBuilder.append(current.getNext().generatePolynomial());
            current = current.getNext();
        } while (current != head);
        System.out.println(stringBuilder.toString());
    }
}
