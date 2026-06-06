class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];

        for(int i = 0; i < cars.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, Comparator.comparingDouble(a -> -a[0]));

        int numOfFleets = 0;
        double currentTime = 0.0;

        for(int i = 0; i < cars.length; i++){
            double time = cars[i][1];

            if(time > currentTime){
                numOfFleets++;
                currentTime = time;
            }
        }

        return numOfFleets;
    }
}
