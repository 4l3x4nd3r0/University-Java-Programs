package packInterface;

public class Sort {
    public static void selectionSort(ISortable[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < array.length; k++)
                if (array[k].compareTo(array[min]) < 0)
                    min = k;
            ISortable temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
    }
}
