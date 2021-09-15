import java.util.Arrays;


public class CarParkingRoof {

    public static int carParkingRoof(int [] cars, int k) {

        if (cars.length == 0 || k < 0) {
            return 0;
        }
        Arrays.sort(cars);
        Integer minDist =Integer.MAX_VALUE;

        for (int i = 0; i <= cars.length - k; i++) {
            minDist = Math.min(minDist, cars[i + k - 1] - cars[i]);
        }

        return minDist + 1;
    }

}
