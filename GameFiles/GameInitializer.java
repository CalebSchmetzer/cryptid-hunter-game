import java.util.List;

// Handles the creation of specific areas and cryptids, as well as the initialization of the player and navigation system. 
public class GameInitializer {
    private Navigation navigation;
    private Player player;

    public GameInitializer() {

        this.navigation = new Navigation();

        this.player = new Player(1);

        Area grasslands = new Area("Grasslands", "a tranquil meadow, where a sea of green, waist-high grass dances gracefully in the breeze.");
        Cryptid gnome = new Cryptid("Gnome", 1, "a short, harmless humanoid.");
        grasslands.addCryptid(gnome);

        Area forest = new Area("Forest", "a dense thicket where swirling mists obscure any potential dangers.");
        Cryptid bigfoot = new Cryptid("Bigfoot", 3, "a large, ape-like beast that favors forested areas.");
        Cryptid mothman = new Cryptid("Mothman", 2, "a winged creature with glowing red eyes.");
        Cryptid blackPanther = new Cryptid("Black Panther", 3, "a large cat with fur as dark as night.");
        Cryptid flatwoodsMonster = new Cryptid("Flatwoods Monster", 3, "an alien with blood-red face and claws.");
        Cryptid graftonMonster = new Cryptid("Grafton Monster", 3, "a giant, white monster which stalks the forest.");
        Cryptid jerseyDevil = new Cryptid("Jersey Devil", 4, "an illusive winged monster. Caution is advised.");
        forest.addCryptid(mothman);
        forest.addCryptid(bigfoot);
        forest.addCryptid(blackPanther);
        forest.addCryptid(flatwoodsMonster);
        forest.addCryptid(graftonMonster);
        forest.addCryptid(jerseyDevil);

        Area lake = new Area("Lake", "a deep lake with murky waters that hold antediluvian secrets.");
        Cryptid lochnessMonster = new Cryptid("Lochness Monster", 4, "an aquating dinosaur that somehow survived extinction.");
        Cryptid beastOfTheLBL = new Cryptid("Beast of the Land Between The Lakes", 4, "a fearsome, aggressive werewolf-like entity that lurks around lakes and campgrounds.");
        Cryptid lovelandFrog = new Cryptid("Loveland Frog", 2, "a humanoid frog-like creature.");
        Cryptid ogopogo = new Cryptid("Ogopogo", 3, "the younger sibling of the Lochness Monster");
        lake.addCryptid(beastOfTheLBL);
        lake.addCryptid(lochnessMonster);
        lake.addCryptid(lovelandFrog);
        lake.addCryptid(ogopogo);

        Area mountains = new Area("Mountains", "a towering range of jagged cliffs and snowy plateaus");
        Cryptid wampusCat = new Cryptid("Wampus Cat", 4, "a fleetfooted feline with an affinity for hunting humans.");
        Cryptid wendigo = new Cryptid("Wendigo", 5, "a large, skeletal being that feeds on human flesh.");
        Cryptid yeti = new Cryptid("Yeti", 5, "the older, more ferocious brother of Bigfoot.");
        mountains.addCryptid(wampusCat);
        mountains.addCryptid(wendigo);
        mountains.addCryptid(yeti);

        Area coastline = new Area("Coastline", "a dark, chilly coastline prone to storms and strange happenings.");
        Cryptid sandwalker = new Cryptid("Sandwalker", 5, "a giant crab with the deadly tail of a scorpion.");
        Cryptid booHag = new Cryptid("Boo Hag", 6, "a cunning, devious witch with shapeshifting powers.");
        coastline.addCryptid(sandwalker);
        coastline.addCryptid(booHag);

        Area deepOcean = new Area("Deep Ocean", "the bottomless depths near the Bermuda Triangle.");
        Cryptid kraken = new Cryptid("Kraken", 6, "a gargantuan octopus known for sinking the ships of unsuspecting sailors.");
        Cryptid megalodon = new Cryptid("Megalodon", 6, "a massive shark that should have been long extinct.");
        Cryptid ningen = new Cryptid("Ningen", 7, "an elusive whale-like creature that inhabits the iciest, darkest depths of the ocean.");
        deepOcean.addCryptid(kraken);
        deepOcean.addCryptid(megalodon);
        deepOcean.addCryptid(ningen);

        navigation.addToUpcomingRegionStack(deepOcean);
        navigation.addToUpcomingRegionStack(coastline);
        navigation.addToUpcomingRegionStack(mountains);
        navigation.addToUpcomingRegionStack(lake);
        navigation.addToUpcomingRegionStack(forest);
        navigation.addToUpcomingRegionStack(grasslands);
    }

    public Navigation getNav() {
        return navigation;
    }

    public Player getPlayer() {
        return player;
    }
}
