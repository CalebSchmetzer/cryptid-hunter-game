public class Cryptid {
    private String name;
    private int difficulty;
    private String description;

    public Cryptid(String name, int difficulty, String description) {
        this.name = name;
        this.difficulty = difficulty;
        this.description = description;

    }

    public int getCryptidDifficulty() {
        return difficulty;
    }

    public String getCryptidName() {
        return name;
    }

    public String getCryptidDescription() {
        return description;
    }
}
