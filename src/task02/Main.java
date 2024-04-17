package task02;

public class Main {
    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();

        System.out.println(duplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5, 1, 2, 3}));
        System.out.println(duplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
