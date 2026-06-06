class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            int index = Arrays.binarySearch(arr, target);

            if(index >= 0)
                return true;
            else
                continue;
        }
        return false;
    }
}
