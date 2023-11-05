import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTests {

    @Test
    public void testSelectionSortWithUnsortedArray() {
        int[] input = {4, 2, 7, 1, 9, 3};
        int[] expectedOutput = {1, 2, 3, 4, 7, 9};
        SelectionSortExamples.selectionSort(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testSelectionSortWithSortedArray() {
        int[] input = {1, 2, 3};
        int[] expectedOutput = {1, 2, 3};
        SelectionSortExamples.selectionSort(input);
        assertArrayEquals(expectedOutput, input);
    }
}

// Symptom:
// The testSelectionSortWithEmptyArray test case passes successfully without any errors.

// Bug Explanation:
// The bug in the selectionSort method lies in the swapping logic. In the initial implementation, there's a mistake in the swap step. The selected minimum element (arr[minIndex]) is assigned to the current index i, but the original value at index i is not stored anywhere. As a result, the value at index i is lost, and incorrect elements are placed in the array, leading to unexpected behavior, especially when duplicate values are present in the array.

// Fix:
// Before swapping the elements, the original value at index i needs to be stored in a temporary variable. Here's the corrected version of the selectionSort method:

// In this corrected version, the original value at index i is stored in the temp variable before swapping. This ensures that the correct swapping occurs, preserving the original value and fixing the bug. Now, the selection sort algorithm should work correctly for arrays with duplicate values and other edge cases.




