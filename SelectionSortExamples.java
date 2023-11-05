// Bugged Code
public class SelectionSortExamples {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            int minIndex = i;
            for (int j = i; j < arr.length; j += 1) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element
            if (i != minIndex) {
                arr[i] = arr[minIndex];
                arr[minIndex] = arr[i];
            }
        }
    }
}

// // Corrected
// public class SelectionSortExamples {
//     static void selectionSort(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             int minIndex = i;
//             for (int j = i; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             // Swap the minimum element with the first element
//             if (i != minIndex) {
//                 int temp = arr[i];
//                 arr[i] = arr[minIndex];
//                 arr[minIndex] = temp;
//             }
//         }
//     }
// }