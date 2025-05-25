import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Pet[] pets = null;
    User user = new User(415.60, pets);

    System.out.println(user);

    //welcoming the user
    System.out.println("Welcome to the Pet Shop! Would you like to buy something?");

    if (scanner.nextLine().equals("Yes")) {
      System.out.println("How many pets would you like to buy?");
      pets = new Pet[scanner.nextInt()];
      scanner.nextLine();

      for (int i = 0; i < pets.length; i++) {
        System.out.println("Pet " + (i + 1));

        System.out.println("What would you like to name your pet?");
        String name = scanner.nextLine(); 

        System.out.println("What kind of pet would you like?");
        String type = scanner.nextLine(); 

        System.out.println("What color fur would you like?");
        String fur = scanner.nextLine();

        pets[i] = new Pet(fur, name, type);

        user.purchase(pets[i].getCost());
        
      }

      user.updatePets(pets);
      System.out.println(user);
      
      for (Pet pet : pets) {
        System.out.println(pet);
      }

    } else {
      System.out.println("See you next time!");
    }

  }
}