public class Driver {
    public static void main(String[] args) {
        //What's poppin' everybody, welcome to my driver, we chill here in the code house
        //Let's test this class and get this bread

        //Step One: Creating a valid Instance
        System.out.println("New Instance Test:\n");
        MyLinkedList list = new MyLinkedList();
        System.out.println(list);
        System.out.println("This should print: \"[]\"\n");

        //Step Two: Let's add some values
        System.out.println("Adding Values Test:\n");
        for(int i = 0; i < 10; i++) {
            list.add(i);
            //System.out.println(list.size()); <- Debugging
        }
        System.out.println(list);
        System.out.println("This should print: \"[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\"");

        //Step Three: Adding a value to the middle
        System.out.println("Adding Values in the Middle Test:\n");
        list.add(5, 999);
        System.out.println(list);
        System.out.println("This should print: \"[0, 1, 2, 3, 4, 999, 5, 6, 7, 8, 9]\"");

        //Step Four: Removing a value from the list by index
        System.out.println("Removing a Value Test:\n");
        list.remove(5);
        System.out.println(list);
        System.out.println("This should print: \"[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\"");

        //Step Five: Remove a value from the list by value
        System.out.println("Remove a Value by its Value Test:\n");
        list.remove(new Integer(9));
        System.out.println(list);
        System.out.println("This should print: \"[0, 1, 2, 3, 4, 5, 6, 7, 8]\"");

        //Step Six: Testing the Contains Method
        System.out.println("Checking Containment Test:\n");
        System.out.println(list.contains(new Integer(999)));
        System.out.println("This should print: false");

        //Step Seven: Testing the Size Method
        System.out.println("Size Test: \n");
        System.out.println(list.size());
        System.out.println("This should print: 9");

        //Step Eight: indexOf Method
        System.out.println("Index of Value Test: \n");
        System.out.println(list.indexOf(0));
        System.out.println("This should print: 0");
        System.out.println("Index of Value Test: \n");
        System.out.println(list.indexOf(4));
        System.out.println("This should print: 4");

    }
}
