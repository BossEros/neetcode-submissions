class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];

        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, Comparator.comparingDouble(a -> -a[0]));

        int numOfFleet = 0;
        double currentTime = 0.0;
        for(int i = 0; i < position.length; i++){
            double time = cars[i][1];

            if(time > currentTime){
                numOfFleet++;
                currentTime = time;
            }
        }
        return numOfFleet;
    }
}
