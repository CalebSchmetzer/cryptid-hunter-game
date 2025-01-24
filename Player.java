import java.util.List;
import java.util.ArrayList;

public class Player {
    private int skill; // Currently unimplemented into the game
    private List < Cryptid > capturedCryptids; // Tracks all Cryptids the player has caught

    public Player(int skill) {
        this.skill = skill;
        this.capturedCryptids = new ArrayList < > ();
    }

    public int getSkill() {
        return skill;
    }

    public int increaseSkill(int increase) {
        return skill += increase;
    }


    public void addCapturedCryptid(Cryptid cryptid) {
        capturedCryptids.add(cryptid);
    }

    public void viewCapturedCryptids() {
        System.out.println("You have captured: ");
        for (Cryptid cryptid: capturedCryptids) {
            System.out.println(cryptid.getCryptidName());
        }

        System.out.println();
    }

}