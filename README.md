# Cryptid Hunter Game  
## Project Documentation  

**Disclaimer:**  
This is a personal project created for the advancement of my personal knowledge of object-oriented programming and data structures. It is not intended to be a large, fully-realized game (yet). As such, core gameplay is a bit repetitive and luck-based until I get a chance to update it.  

---

## About  
This project is a text-based game where the player takes the role of a government agent part of the CAT (Cryptid Apprehension Team). They must traverse through a variety of regions and attempt to capture the cryptids who lurk there.  

---

## How To Play
You will start in a beginner area which is intended to get you acquainted with the gameplay systems. You can choose to either explore the region (will trigger a cryptid encounter), progress to the next region, backtrack to the previous region (unavailable at the starting region), or view a list of your captured cryptids (starts off empty). Every cryptid encounter will have you play a game of high-low where the cryptid's difficulty level determines the number of correct guesses you need to capture it, as well as the number of total guesses you have before failing the capture attempt. 

## Classes  

### **CryptidHunterGame**  
- **Purpose:** Main class which starts the game and handles action selection in the player menu.  

### **Cryptid**  
- **Purpose:** Represents a cryptid that a player can encounter.  
- **Key Attributes:**  
  - Name  
  - Description  
  - Difficulty level  
- **Functionality:**  
  - Provides methods to get cryptid information.  

### **Player**  
- **Purpose:** Represents the player.  
- **Key Attributes:**  
  - Skill level  
  - List of captured cryptids  
- **Note:**  
  - Currently, the skill stat has no impact on gameplay, but this will be changed in a future update.  

### **Area**  
- **Purpose:** Represents a region the player can visit.  
- **Key Attributes:**  
  - Name  
  - Description  
  - Cryptid queue (a queue of cryptids that populate the area)  
- **Functionality:**  
  - Provides methods to get the name, description, and cryptid queue of the area.  

### **Navigation**  
- **Purpose:** Handles the navigation of the player.  
- **Key Mechanic:** Uses two stacks to allow the player to both progress and backtrack through areas.  
- **Functionality:**  
  - Provides methods to get the player’s current area and the next upcoming area.  

### **Encounter**  
- **Purpose:** Handles the interactions between the player and cryptids.  
- **Functionality:**  
  - Contains the logic for the minigame that determines whether a player successfully captures a cryptid or not.  
  - Handles the consequences of the encounter.  

### **GameInitializer**  
- **Purpose:** Initializes the player, navigation system, cryptids, and areas before the player starts the game.  
- **Functionality:**  
  - Provides methods to get the navigation system and player.  

---

## Future Updates  

1. **Improve the cryptid encounter system and the capture minigame**  
   - Make the player's skill stat factor into the difficulty of the encounter.  
   - Add unique mechanics for each cryptid.  

2. **Reduce the repetitiveness of the gameplay and increase replayability**  
   - Add random events such as finding power-ups or secret cryptid bosses.  

3. **Expand game content**  
   - Add a larger variety of areas and cryptids.  
   - Add towns filled with NPCs and shops that the player can interact with.  
