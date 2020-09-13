import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JFrame {
    int ACMilanScore = 0, RealMadridScore = 0;

    JButton ACMilan = new JButton();
    ImageIcon ACMilanIcon =
            new ImageIcon((new ImageIcon("image/ACMilanLogo.png").getImage()
            .getScaledInstance(230, 323, Image.SCALE_SMOOTH)));

    JButton RealMadrid = new JButton();
    ImageIcon RealMadridIcon =
            new ImageIcon(new ImageIcon("image/RealMadridLogo.png").getImage()
                    .getScaledInstance(230, 323, Image.SCALE_SMOOTH));

    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScore = new JLabel("N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JLabel ACMilanTeam = new JLabel("AC Milan");
    Font fnt = new Font("Times New Roman", Font.BOLD, 36);

    // Метод для обработки информации о победителе
    public void printWinner() {
        if (ACMilanScore > RealMadridScore) {
            winner.setText("Winner: AC Milan");
        } else if (ACMilanScore < RealMadridScore) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("DRAW");
        }
    }

    // Метод для обработки полей счета, победителя и последнего забившего
    public void JLabelSettings(JLabel jlabel) {
        jlabel.setHorizontalAlignment(JLabel.CENTER);
        jlabel.setForeground(Color.BLACK);
        jlabel.setFont(fnt);
    }

    // Метод обработки кнопок команд
    public void teamButton(JButton team, String teamName, Color color) {
        team.setText(teamName);
        team.setVerticalTextPosition(JButton.BOTTOM);
        team.setHorizontalTextPosition(JButton.CENTER);
        team.setForeground(color);
        team.setFont(fnt);
    }

    Label() {
        // Параметры окна
        super("Football Score");
        setIconImage(new ImageIcon("image/appIcon.jpg").getImage());
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(960, 540));

        ACMilan.setIcon(ACMilanIcon);
        ACMilan.setFocusable(false);
        ACMilan.setBorderPainted(false);
        RealMadrid.setIcon(RealMadridIcon);
        RealMadrid.setFocusable(false);
        RealMadrid.setBorderPainted(false);

        // Обработка AC Milan
        add(ACMilan, BorderLayout.EAST);
        ActionListener ACMilanListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ACMilanScore++;
                result.setText("Result: " + RealMadridScore + " X " + ACMilanScore);
                printWinner();
                lastScore.setText("Last score: AC Milan");
            }
        };
        teamButton(ACMilan, "AC Milan", Color.RED);
        ACMilan.addActionListener(ACMilanListener);

        // Обработка Real Madrid
        add(RealMadrid, BorderLayout.WEST);
        ActionListener RealMadridListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealMadridScore++;
                result.setText("Result: " + RealMadridScore + " X " + ACMilanScore);
                printWinner();
                lastScore.setText("Last score: Real Madrid");
            }
        };
        teamButton(RealMadrid, "Real Madrid", Color.yellow);
        RealMadrid.addActionListener(RealMadridListener);

        // Обработка счета
        add(result, BorderLayout.CENTER);
        JLabelSettings(result);

        // Обработка победителя
        add(winner, BorderLayout.NORTH);
        JLabelSettings(winner);

        // Обработка последнего забившего
        add(lastScore, BorderLayout.SOUTH);
        JLabelSettings(lastScore);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Label();
    }
}
