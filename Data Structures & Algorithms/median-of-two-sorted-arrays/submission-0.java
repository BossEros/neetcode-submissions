class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Integer[] arr1 = Arrays.stream(nums1)
            .boxed()
            .toArray(Integer[]::new);

        Integer[] arr2 = Arrays.stream(nums2)
            .boxed()
            .toArray(Integer[]::new);
        
        List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        Collections.sort(list);

        double median = 0.0;
        if(list.size() % 2 == 1){
            int middle = (list.size() / 2);
            median = list.get(middle);

            return median;
        } else {
            int left = list.size() / 2 - 1;
            int right = (list.size() / 2);
            median = (double) (list.get(left) + list.get(right)) / 2;

            return median;
        }
    }
}
