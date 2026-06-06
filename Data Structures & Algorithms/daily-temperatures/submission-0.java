class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> result = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            if(i == temperatures.length - 1){
                result.push(0);
                break;
            }
            int count = 1;
            boolean found = false;
            for(int j = i + 1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    result.push(count);
                    found = true;
                    break;
                }
                count++;
            }
            if(!found)
                result.push(0);
        }
        Integer[] array = new Integer[result.size()];
        result.toArray(array);

        int[] answer = new int[array.length];
        for(int a = 0; a < array.length; a++){
            answer[a] = array[a];
        }


        return answer;
    }
}
