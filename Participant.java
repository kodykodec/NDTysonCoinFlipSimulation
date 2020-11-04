import java.util.ArrayList;
import java.util.Random;

public class Participant {

    private String name;
    private int headsCount = 0;
    private static Random flip = new Random();

    public Participant() {
        this.name = NameGenerator.generateName();
        this.headsCount = headsCount;
    }

    public void setHeadsCount() {
        this.headsCount = headsCount + 1;
    }

    public int getHeadsCount() {
        return headsCount;
    }


    public String getName() {
        return name;
    }

    public static int coinFlip() {
        return flip.nextInt(2) + 1;
    }


    @Override
    public String toString() {
        return name +
                ", headsCount:" + headsCount;
    }

    static class NameGenerator {

        private static String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
                "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
                "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
                "Mar", "Luk" };
        private static String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
                "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
                "marac", "zoir", "slamar", "salmar", "urak" };
        private static  String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
                "tron", "med", "ure", "zur", "cred", "mur" };

        private static Random rand = new Random();

        public static String generateName() {

            return Beginning[rand.nextInt(Beginning.length)] +
                    Middle[rand.nextInt(Middle.length)]+
                    End[rand.nextInt(End.length)];

        }

    }



}
