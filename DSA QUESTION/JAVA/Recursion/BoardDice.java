import java.util.ArrayList;

public class BoardDice {

    static ArrayList<String> dicePos(int start, int target) {
        if(start==target) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(start>target) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice=1; dice<=6; dice++) {
            int currentValue = start + dice;
            ArrayList<String> list = dicePos(currentValue, target);
            for(String temp : list) {
                finalResult.add(temp+dice);
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        ArrayList<String> result = dicePos(0, 5);
        System.out.println(result);
    }
}
