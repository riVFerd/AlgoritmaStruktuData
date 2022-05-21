package minggu7.latihan;

public class Tugas3 {
    int[] array;
    int largest, counter;
    int[] idLargest;

    Tugas3(int[] array) {
        this.array = array;
        idLargest = new int[array.length];
    }

    void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Saat sudah dilakukan ascending sort
        // maka otomatis nilai terbesar adalah yang di index terakhir
        largest = array[array.length - 1];
    }

    void showSorted() {
        System.out.print("Data array setelah diurutkan : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void findIndex(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (array[mid] == largest) {
                idLargest[counter] = mid;
                counter++;
                findIndex(array, mid + 1, right);
            } else {
                if (largest < array[mid]) {
                    findIndex(array, left, mid - 1);
                } else {
                    findIndex(array, mid + 1, right);
                }
            }
        }
    }

    void showIdLargest() {
        System.out.println("Nilai terbesar ditemukan pada : ");
        for (int i = 0; i < counter; i++) {
            System.out.println("Index ke-" + idLargest[i]);
        }
    }
}
