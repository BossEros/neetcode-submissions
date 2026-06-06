class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int n = position.length;
        double[][] cars = new double[n][2];
        
        // Calculate time to reach the target for each car
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }
        
        // Sort cars based on their starting positions in descending order
        Arrays.sort(cars, Comparator.comparingDouble(a -> -a[0]));
        
        int fleets = 0;
        double currentFleetTime = 0;
        
        // Iterate through the sorted cars
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            // If the current car takes longer to reach the destination than the current fleet time,
            // it forms a new fleet
            if (time > currentFleetTime) {
                fleets++;
                currentFleetTime = time;
            }
        }
        
        return fleets;
    }
}
