import java.util.Map;
import java.util.Scanner;

class Sarah {
  static String[] hobbies = {"* Sewing and cosplay", "* Geocaching", "* Boating (esp. Sailing!)"};
  static String[] games = {"* Minecraft", "* World of Warcraft", "* Stardew Valley"};

  static Map<String, String> socials = Map.of(
    "Instagram", "missmartel23",
    "Discord", "sarahamarie",
    "Linkedin", "sarahmarie23",
    "Github", "sarahmarie23"
    );
  
    static boolean isAlive = true;

  public static void getHobbies() {
    System.out.println("If you like any of these things, then we definitely need to do something");

    for (String hobby : hobbies) {
      System.out.println(hobby);
      Scanner input = new Scanner(System.in);
      String continueStr = input.nextLine();
    }
  }

  public static void getGames() {
    System.out.println("I don't play many games, but I DO enjoy the following:");

    for (String game : games) {
      System.out.println(game);
      Scanner input = new Scanner(System.in);
      String continueStr = input.nextLine();
    }
  }

  public static void getFunFacts() {
    System.out.println("A little more about me:\n");

    String[] facts = {
      "* MS Computer Science Software Engineering UW Bothell",
      "* From Southern California (Los Angeles/Long Beach)",
      "* I'm going to PAX WEST!!",
      "* Currently work as a TA teaching Java and C++",
      "* Let's nerd out to: coding, mental health, creative stuffs :D"
    };

    for (String fact: facts) {
      System.out.println(fact);
      Scanner input = new Scanner(System.in);
      String continueStr = input.nextLine();
    }
  }
    
  public static boolean shouldWeBeFriends(String friend) {
    while(Sarah.isAlive) {
      System.out.println(friend + ", we should definitely be friends!");
      return true;
    }  

    return false;
  }
  
  public static void getSocials() {
    for (Map.Entry<String, String> entry : socials.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

    String choice ="";
    
    do {
      System.out.println("\n=======================================\n");
      System.out.println("This presentation will share with you ");
      System.out.println("why you should be friends with Sarah!");
      System.out.println("\n=======================================\n");
      
      printChoices();
      System.out.print("Choose a number to learn more: ");
      
      choice = input.nextLine();
      System.out.println("\n============================\n");

      switch (choice) {
        case "1":
          Sarah.getHobbies();
          continueMessage();
          break;
        
        case "2":
          Sarah.getGames();
          continueMessage();
          break;

        case "3":
          Sarah.getFunFacts();
          continueMessage();
          break;

        case "4":
          String friend = "Your Name Here";
          System.out.print("What is your name? ");
          friend = input.nextLine();

          Sarah.shouldWeBeFriends(friend);
          continueMessage();
          break;

        case "5":
          System.out.println("Here are my social media things...");
          Sarah.getSocials();
          continueMessage();
          break;
        
        case "0":
          System.out.println("Thanks for playing! I hope you consider being friends :)");
          System.exit(0);

        default:
          System.out.println("Not a valid option!");
          break;
      }
    } while (!choice.equals("[0-5]"));
    
    input.close();

  }

  public static void printChoices() {
    System.out.println("1 -> Learn about Sarah's hobbies and interests");
    System.out.println("2 -> Wanna game? Maybe I do too...");
    System.out.println("3 -> Fun facts I guess?");
    System.out.println("4 -> Need help making a decision?");
    System.out.println("5 -> Let's connect!");
    System.out.println("0 -> Quit");
  }

  public static void continueMessage() {
    Scanner input = new Scanner(System.in);
    System.out.println("\nPress anything to continue...");
    String continueStr = input.nextLine();
  }
}