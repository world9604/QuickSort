public class Main {
    public static void main(String[] args) {
        int number = 10;
        int data[] = {1, 10, 5, 8, 7, 6, 3, 4, 2, 9};

        QuickSort sort = new QuickSort(data, number);
        sort.quickSort(data, 0, number - 1);
        sort.show();
    }
}
