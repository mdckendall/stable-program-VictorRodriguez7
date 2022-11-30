import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String addressInput;
        String nameInput;
        double weightInput;
        boolean isTameInput;
        char choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the address of the stable?");
        addressInput = scanner.nextLine();

        Stable stable = new Stable(addressInput);

        System.out.println("Do you wish to add a horse to the stable?");
        choice = scanner.next().charAt(0);


        while(choice == 'y'){
            scanner.nextLine();

            System.out.println("What is the name of the horse?");
            nameInput = scanner.nextLine();

            System.out.println("What is the weight of the horse?");
            weightInput = scanner.nextDouble();

            System.out.println("Enter true if the horse is tame or false if it is not.");
            isTameInput = scanner.nextBoolean();

            Horse horse = new Horse(nameInput,weightInput,isTameInput);

            stable.horseArrayList.add(horse);

            System.out.println("Do you wish to add a horse to the stable?");
            choice = scanner.next().charAt(0);

        }

        for(int i = 0; i < stable.horseArrayList.size(); i++){
            System.out.println("Horse #" + (i+1) + " Name: "
                    + stable.horseArrayList.get(i).name + " Weight: "
                    + stable.horseArrayList.get(i).weight + " Tame: "
                    + stable.horseArrayList.get(i).isTame);
        }


    }

}