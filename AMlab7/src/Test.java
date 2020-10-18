import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Правила игры в 'пьяницу': " +
                "\n\t1) В игре участвует 10 карт, имеющих значения от 0 до 9, большая карта побеждает меньшую, " +
                "карта «0» побеждает карту «9»." +
                "\n\t2) В этой игре карточная колода раздается поровну двум игрокам. " +
                "\n\t3) Далее они открывают по одной верхней карте, и тот, чья карта старше, забирает себе обе открытые" +
                " карты, которые кладутся под низ его колоды. Тот, кто остается без карт, - проигрывает." +
                "\n\t4) Для простоты будем считать, что все карты различны по номиналу и что самая младшая карта " +
                "побеждает самую старшую карту (“шестерка берет туз”)." +
                "\n\t5) Игрок, который забирает себе карты, сначала кладет под низ своей колоды карту первого игрока, " +
                "затем карту второго игрока (то есть карта второго игрока оказывается внизу колоды). ");


        System.out.println("С использованием стека");
        Stack<Integer> firstPlayerS = new Stack<>();
        System.out.println("Введите карты перового игрока");
        for (int i = 0; i < 5; i++) {
            firstPlayerS.push(keyboard.nextInt());
        }
        Stack<Integer> secondPlayerS = new Stack<>();
        System.out.println("Введитка карты второго игрока");
        for (int i = 0; i < 5; i++) {
            secondPlayerS.push(keyboard.nextInt());
        }
        System.out.println("Результат: " + StackSolution.game(firstPlayerS, secondPlayerS) + "\n\n");


        System.out.println("С использованием очереди");
        Queue<Integer> firstPlayerQ = new LinkedList<>();
        System.out.println("Введите карты перового игрока");
        for (int i = 0; i < 5; i++) {
            firstPlayerQ.add(keyboard.nextInt());
        }
        Queue<Integer> secondPlayerQ = new LinkedList<>();
        System.out.println("Введите карты второго игрока");
        for (int i = 0; i < 5; i++) {
            secondPlayerQ.add(keyboard.nextInt());
        }
        System.out.println("Результат: " + QueueSolution.game(firstPlayerQ, secondPlayerQ) + "\n\n");


        System.out.println("С использоованием двухсторонней очереди");
        Deque<Integer> firstPlayerDeq = new LinkedList<>();
        System.out.println("Введите карты первого игрока");
        for (int i = 0; i < 5; i++) {
            firstPlayerDeq.add(keyboard.nextInt());
        }
        Deque<Integer> secondPlayerDeq = new LinkedList<>();
        System.out.println("Введите карты второго игрока");
        for (int i = 0; i < 5; i++) {
            secondPlayerDeq.add(keyboard.nextInt());
        }
        System.out.println("Результат: " + DequeueSolution.game(firstPlayerDeq, secondPlayerDeq) + "\n\n");


        System.out.println("С использованием двусвязного списка");
        LinkedList<Integer> firstPlayerDl = new LinkedList<>();
        System.out.println("Введите карты первого игрока");
        for (int i = 0; i < 5; i++) {
            firstPlayerDl.add(keyboard.nextInt());
        }
        LinkedList<Integer> secondPlayerDl = new LinkedList<>();
        System.out.println("Введите карты второго игрока");
        for (int i = 0; i < 5; i++) {
            secondPlayerDl.add(keyboard.nextInt());
        }
        System.out.println("Результат: " + DoubleListSolution.game(firstPlayerDl, secondPlayerDl) + "\n\n");
    }
}
