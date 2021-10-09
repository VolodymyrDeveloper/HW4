package HW5;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyList();
        list.add(2);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println("My Arraylist  " + list);
        System.out.println("Smallest values in the ArrayList  " + list.smallest());
        System.out.println("Largest values in the ArrayList  " + list.largest());
    }

}
