import java.util.Scanner;

public class ZiskindHouse extends Building{
    
    public ZiskindHouse(String name, String address, int nFloors) {
        super(name, address, nFloors);
    }

    public void explore (Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- You're now at your double dorm at Ziskind House ---");
        System.out.println("Here you can: ");
        System.out.println("1. Walk to your roommate's desk");
        System.out.println("2. Look around the floor ");
        System.out.println("3. Check your roommate\'s little white board ");
        System.out.println("4. Open the closet ");
        System.out.println("5. Stay for a while and have a rest ");

        System.out.println("Choose 1-5: ");
        String choice1 = in.nextLine().trim();

        switch(choice1){
            case "1":
                revealClue("DORM_1", clueList, clueBook);
                break;
            case "2":
                revealClue("DORM_2", clueList, clueBook);
                break;
            case "3":
                revealClue("DORM_3", clueList, clueBook);
                break;
            case "4":
                revealClue("DORM_4", clueList, clueBook);
                break;
            case "5":
                System.out.println("You sit on your bed and watched instagram reels for an hour. LOL");
            default:
                System.out.println("Nothing happened, but your roommate will feel really sad if you're not feeling worried about her and finding her. ");
        }

    }
}
