
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] BIRDS_LAST_WEEK = {0,2,5,3,7,8,4}; // initialize  last week's counts
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    
    public int[] getLastWeek() {
        return BIRDS_LAST_WEEK; // return last week's counts
    }

    public int getToday() { //return today's count of birds.
        if(birdsPerDay.length == 0)// if the list is empty, we can't index [length-1]
            return 0; // so return 0 instead
        else
            return birdsPerDay[birdsPerDay.length-1]; // the last element in the list is today's count
}   
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+= 1; // the last element in the list is today's count
    }

    public boolean hasDayWithoutBirds() {
        for(int i: birdsPerDay){
            if(i == 0) // if there is any day in the week with zero birds, return true
                return true;
        }
        return false; // if there is at least one bird per day, return false
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays > 7) // if asked for more days than are in the list, 
            numberOfDays = 7;// get count for whole list
        for(int i = 0; i < numberOfDays; i++){ 
            sum += birdsPerDay[i]; // calculate a running sum of birds
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0; // initialize a counter
        for(int i: birdsPerDay)
            if(i >= 5) // a 'busy day' is any day with five or more bird sightings
             count++;  // increment count each time we have a busy day
        return count;
    }
}
