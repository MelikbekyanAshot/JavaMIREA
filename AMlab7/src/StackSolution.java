import java.util.Stack;

public class StackSolution {

    public static Stack<Integer> addDown(Stack<Integer> stack, Integer firstPlayerCard, Integer secondPlayerCard) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        Stack<Integer> result = new Stack<Integer>();
        result.push(firstPlayerCard);
        result.push(secondPlayerCard);
        while (!temp.empty()) {
            result.push(temp.pop());
        }
        return result;
    }

    public static String game(Stack<Integer> firstPlayer, Stack<Integer> secondPlayer) {
        for (int i = 0; i < 106; i++) {
            if (firstPlayer.size() == 0) {
                return "second " + i;
            } else if (secondPlayer.size() == 0) {
                return "first " + i;
            } else {

                Integer firstPlayerCard = firstPlayer.peek();
                Integer secondPlayerCard = secondPlayer.peek();
                firstPlayer.pop();
                secondPlayer.pop();
                if (firstPlayerCard != 0 && secondPlayerCard != 0) {
                    if (firstPlayerCard > secondPlayerCard) {
                        firstPlayer = addDown(firstPlayer, firstPlayerCard, secondPlayerCard);
                    } else {
                        secondPlayer = addDown(secondPlayer, secondPlayerCard, firstPlayerCard);
                    }
                } else if (firstPlayerCard == 9 || secondPlayerCard == 9) {
                    if (firstPlayerCard == 0) {
                        firstPlayer = addDown(firstPlayer, firstPlayerCard, secondPlayerCard);
                    } else {
                        secondPlayer = addDown(secondPlayer, secondPlayerCard, firstPlayerCard);
                    }
                }
            }
        }
        return "botva";
    }
}
