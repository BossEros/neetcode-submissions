class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 0)
            return 0;
        
        double[][] array = new double[position.length][2];      
        for(int i = 0; i < position.length; i++){
            array[i][0] =  position[i];
            array[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(array, Comparator.comparingDouble(a -> -a[0]));

        int numOfFleet = 0;
        double currentTime = 0;

        for(int i = 0; i < position.length; i++){
            double time = array[i][1];
            if(time > currentTime){
                numOfFleet++;
                currentTime = time;
            }
        }

        return numOfFleet;
    }
}
