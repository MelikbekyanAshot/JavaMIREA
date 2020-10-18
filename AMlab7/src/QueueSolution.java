import java.util.Queue;

public class QueueSolution {

    public static String game(Queue<Integer> firstPlayer, Queue<Integer> secondPlayer) {
        for (int i = 0; i < 106; i++) {
            if (firstPlayer.size() == 0) {
                return "second " + i;
            } else if (secondPlayer.size() == 0) {
                return "first " + i;
            } else {
                Integer firstPlayerCard = firstPlayer.peek();
                Integer secondPlayerCard = secondPlayer.peek();
                firstPlayer.poll();
                secondPlayer.poll();
                if (firstPlayerCard != 0 && secondPlayerCard != 0) {
                    if (firstPlayerCard > secondPlayerCard) {
                        firstPlayer.add(firstPlayerCard);
                        firstPlayer.add(secondPlayerCard);
                    } else {
                        secondPlayer.add(secondPlayerCard);
                        secondPlayer.add(firstPlayerCard);
                    }
                } else if (firstPlayerCard == 9 || secondPlayerCard == 9) {
                    if (firstPlayerCard == 0) {
                        firstPlayer.add(firstPlayerCard);
                        firstPlayer.add(secondPlayerCard);
                    } else {
                        secondPlayer.add(secondPlayerCard);
                        secondPlayer.add(firstPlayerCard);
                    }
                }
            }
        }
        return "botva";
    }
}
