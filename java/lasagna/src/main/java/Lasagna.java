public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layersOfLasagna) {
        return 2*layersOfLasagna;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layersOfLasagna, int actualMinutesInOven) {
        return preparationTimeInMinutes(layersOfLasagna) + actualMinutesInOven;
    }
}
