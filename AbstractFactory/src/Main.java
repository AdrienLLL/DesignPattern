/**
 * Created by Adrien-PC on 04/01/2017.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        this.setTitle("AbstractFactory");
        this.setSize(500, 500);

        JPanel P = new JPanel();

        JComboBox<Choix> comboBoxChoix = new JComboBox<>(Choix.values());

        P.add(comboBoxChoix);

        MarioThemeButton MarioBtn = new MarioThemeButton();
        JButton myBtn = MarioBtn.createButton();

        P.add(myBtn);

        comboBoxChoix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton myBtn;
                if (comboBoxChoix.getSelectedItem() == Choix.Mario) {
                    MarioThemeButton btn = new MarioThemeButton();
                    myBtn = btn.createButton();
                } else {
                    StarWarsThemeButton btn = new StarWarsThemeButton();
                    myBtn = btn.createButton();
                }

                P.remove(1);
                P.add(myBtn);
                P.repaint();
                P.revalidate();
                ;
            }
        });

        this.setContentPane(P);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
