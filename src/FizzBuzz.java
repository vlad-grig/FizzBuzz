public class FizzBuzz {

    private final IOService ioService;

    public FizzBuzz() {
        this.ioService = new IOService();
    }

    void fizzBuzzPlayTime() {
        int a = 3;
        int b = 5;
        int countFizz = 0;
        int countBuzz = 0;
        int countFizzBuzz = 0;

        for(int index = 1; index < 100; index++) {
            if (index % a == 0 && index % b != 0) {
                System.out.println(index + " Fizz");
                countFizz++;
            } else if (index % b == 0 && index % a != 0) {
                System.out.println(index + " Buzz");
                countBuzz++;
            } else if (index % b == 0) {
                System.out.println(index + " FizzBuzz");
                countFizzBuzz++;
            } else {
                System.out.println(index);
            }
        }
        ioService.displayMessage("Fizz appears " + countFizz + " times in the range 1 - 100!");
        ioService.displayMessage("Buzz appears " + countBuzz + " times in the range 1 - 100!");
        ioService.displayMessage("FizzBuzz appears " + countFizzBuzz + " times in the range 1 - 100!");
    }
}
