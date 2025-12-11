import java.util.HashMap;
import java.util.Map;

public class ClueList{

    private Map<String, Clue> clues;

    public ClueList() {
        clues = new HashMap<>();
        loadClues();
    }

    private void addClue(String code, String description) {
        clues.put(code, new Clue(code, description));
    }

    public Clue getClueByCode(String code) {
        return clues.get(code);
    }

    private void loadClues() {
        addClue("DORM_1", "Roommate's laptop and school bags are still nicely on the desk. ");
        addClue("DORM_2", "Roommate's clothes and socks are on the floor as it always has been. ");
        addClue("DORM_3", "There are several to-dos on the white board: \n 1. work out at gym \n 2. hand in SDS paper \n 3. go to landscape professor's office hour");
        addClue("DORM_4", "The coat has been taken away in the closet. ");

        addClue("GYM_1", "The reception says she haven't seen anyone like her, but you can definitely check upstairs. ");
        addClue("GYM_2", "Found a swimming suite that your roommate has with a smith college logo in the fitting room.");
        addClue("GYM_3", "No one found in the swimming pool. ");
        addClue("GYM_4", "Friend: Your roommate didn't come to the SDS class today. ");

        addClue("SABINREED_1", "Doris: I met her yesterday, and she asked me for the class notes.");

        addClue("NEILSON_1", "The librarian at circulation says that your roommate just borrowed a book yesterday. ");
        addClue("NEILSON_2", "The computer was logged in with the roommate's account");
        addClue("NEILSON_3", "The downloaded folder has a flight itinerary today to China with your roommate's printed name. ");
        addClue("NEILSON_4", "The other librarian says she saw someone like your roommate returning a book. ");
        addClue("NEILSON_5", "No one is in this quiet area on the second floor. Werid... ");
        addClue("NEILSON_6", "One water bottle exact same as the roommate's was left on the third floor quiet area. ");

        addClue("BURTON_1", "There is a note on the professor's desk saying 'want to find me? email me at emailme@smith.edu'. ");
        addClue("BURTON_2", "Everything is normal on my roommate's table. ");
        addClue("BURTON_3", "Nothing found here. ");

        addClue("HILLYER_1","Amy: I saw her yesterday, and she took her camera and film with her and said she will shoot some great photos.");
        addClue("HILLYER_2","Emily: I was having dinner with her yesterday and she said she really missed LiuYiShou hotpot in Boston.");

        addClue("SEELYE_1", "Joyce: I saw her going to class yesterday. ");
        addClue("SEELYE_2", "Found a to-do list notebook from your roommate, including things to do: \n 1. assignment 8 due tuesday. \n 2. packing \n 3. call mom \n 4. book a car ride to boston");

        addClue("BotanicGarden_1","Your roommate asked me to take care of the plants for a few days。");

        addClue("CC_1", "Shally said, \" Oh, you know what, I have watched tiktok for two hours today. The view in Barcelona is soooo beautiful. Your roommate also liked the video!\" ");

    }
}
