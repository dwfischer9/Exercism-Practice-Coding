class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = (input*(input+1))/2; // the sum of the first N natural numbers is (n(n+1))/2. This is far better than using a loop, this achieves O(1) time complexity
        return sum * sum; // square the sum
    }

    int computeSumOfSquaresTo(int input) {
        int sum = (input * (input + 1)*(2 * input + 1))/6; // calculate the sum of the squares of the first N natural numbers
        return sum; // the sum of the squares of the first n natural numbers is (n(n+1)(2n+1))/6
    }               //once again eliminating the need of a loop and achieving O(1) complexity

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);//return the difference
        
    }

}
