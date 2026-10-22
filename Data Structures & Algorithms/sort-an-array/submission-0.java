class Solution {
    // merge sort
    //sub array left - [left... mid]
    // sub array right - [mid+1 ... right]
    static void merge(int left, int right, int mid, int[] arr){
        int leftLength = mid - left + 1;
        int rightLength = right - mid;
        // create temporary arrays
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        // copy data into temp arrays
        for(int i = 0; i < leftLength; ++i){
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < rightLength; ++j){
            rightArray[j] = arr[mid + 1 + j];
        }

        // merge the temp arrays
        int i = 0, j = 0;
        int k = left;
        while (i < leftLength && j < rightLength){
            if (leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // copy the remaining values
        while (i < leftLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            // merge the sorted halves
            merge(left, right, mid, arr);
        }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
        
    }
}