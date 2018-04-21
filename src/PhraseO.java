/**
 * Created by ngoni on 4/20/18.
 */
public class PhraseO {

    public static void main(String[] args) {

        String[] wordListOne ={"24/7", "multi-tier", "win-win"};

        String[] wordListTwo ={"sticky", "valued", "smart"};

        String[] wordListThree = {"portal", "space", "solution"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int randOne = (int) (Math.random() * oneLenght);
        int randTwo = (int) (Math.random() * twoLenght);
        int randThree = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        System.out.println(phrase);



    }


}
