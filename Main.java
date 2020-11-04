import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        int numOfParticipants = 100;

        List<Participant> participantsList = new ArrayList<>(numOfParticipants);
        List<Participant> winnersList = new ArrayList<>();
        List<Participant> loserList = new ArrayList<>();

        //this loop creates our contestants with unique names
        for (int i = 0; i < numOfParticipants; i++) {
            participantsList.add(new Participant());
        }

        int flipRound = 1; //keeps track of the rounds after each person flips a coin

        while (participantsList.size() != 1) {//the loop where each person flips a coin determining who sits or stays in the game
                System.out.println();
                System.out.println("Beginning round " + flipRound);
                System.out.println("1 = heads, 2 = tails");
                for (int i = 0; i < participantsList.size(); i++) {
                    int number = Participant.coinFlip();
                    System.out.println("coin flip was " + number);
                    if (number == 2) {
                        System.out.println(participantsList.get(i).getName() + " got " + number + " they will now sit down");
                        loserList.add(participantsList.get(i));
                        participantsList.remove(i);
                    } else {
                        participantsList.get(i).setHeadsCount();
                        winnersList.add(participantsList.get(i));
                        System.out.println(participantsList.get(i).getName() + " has flipped heads, they keep standing");
                    }
                }
                System.out.println("The list of participants are: " + Arrays.asList(participantsList));
            if (participantsList.size() == 1) {
                System.out.println("We have a winner! " + participantsList.get(0).getName() + "! They flipped heads " + participantsList.get(0).getHeadsCount() + " consecutive times");
            }
                // System.out.println("The List of Winners are: " + Arrays.asList(winnersList));
                // System.out.println("The list of Losers are: " + Arrays.asList(loserList));
                flipRound++;
            }
        }
    }

