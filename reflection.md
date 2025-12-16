 - What was your **overall approach** to tackling this project?
 - What **new thing(s)** did you learn / figure out in completing this project?
 - Is there anything that you wish you had **implemented differently**?
 - If you had **unlimited time**, what additional features would you implement?
 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.

- We use narrative driven approach to make this text adventure game, started by clearly defining the story background and the palyer's role, which is the user found their roommate has disappeared. Then, we break the experience down into locations, characters, and clues. From there, we desinged our classes around real-world concepts, like buildings, people, and clues, and we also used object-oriented principles like inheritance and encapsulation to keep the structure organized. 

- The new things we learned is how to structure interactive loops in a text-based game. In particular, we learned that placing loops inside building-specific method explore() allows the player to stay in one location and make multiple choices without repeatedly restarting the interaction. We also learned about how to track user's locations and how to track found clues, and how small design choices in command structure can greatly affect user experience.

- We would design the command system earlier, instead of adjusting it as the game grew. At first, we started from thinking of the logic of the game and the story background. Then, we imagined different classes and how they gonna work together, but then we found out that a lot of classes we imagined before weren't useful actually. What we ignored and now realize what would be better to think about first is the command system, and this is from the user's perspective. For example, if we are the user, how we gonna play the game and when we want to use explore, and what's other command or method we would like to use.

- With unlimited time, we would add a more flexible natural-language command parser instead of strictly numbered options, a dynamic dialogue system with brancing responses based on previous choices, more consequences tied to time or number of actions, multiple endings based on how throughly the player investigates, a visual map to accompany the text interface.

- The most helpful feedback came from our frineds during playtesting, who pointed out that having to type explore repeatedly in the same building felt tedious and broke immersion. This feedback directly led us to redesign our exploration logic using loops so that players could remain inside a building and continue interacting naturally. That feedback significantly improved the overall user experience.

- If we could go back in time, we would tell ourselves to prototype user interaction earlier and test the game flow before fully committing to an implementattion. Writing code that works is important, but writing code that feels good to use is just as critical. 

- Working as a team helped us catch both techinical and design issues more quickly. At first, we brainstorm idea and whole concept together, and the discussion really helps and inspires. Then, we focused on different aspects of the story like the different user experience of different building at different time. We also divide the code to work on -- I wrote cc, burton, gym and she wrote neilson, sabin-reed, and seelye -- which made the whole process much more efficient. After solo work, we would test and check each other's code and then discuss again. Discussing furstrations like repetitive commands or errors often led to better solutions than working alone, and team feedback pushed us to improve the game.