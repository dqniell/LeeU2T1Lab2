public class ChatBotRunner {
    public static void main(String[] args) {

        ChatBot debbie = new ChatBot("Debbie", 2);

        //void methods
        debbie.greeting("Daniel");
        debbie.weather();
        debbie.favoriteNumber(11);

        //return methods
        double meters = debbie.convertFeetToMeters(12);
        System.out.println("In 20 feet, there are: " + meters + " meters." );

        int sumOfNumbers = debbie.addNumbers(1, 2, 3);
        System.out.println("The sum of 1, 2, and 3 is: " + sumOfNumbers);

        String adios = debbie.goodbye();
        System.out.println(adios);

    }
}
