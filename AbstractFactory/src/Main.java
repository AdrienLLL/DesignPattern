/**
 * Created by Adrien-PC on 04/01/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main extends JFrame
{
    private static JComboBox comboBoxChoix;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);

        List<Choix> lChoix = Arrays.asList(Choix.values());

         comboBoxChoix.addItem(lChoix);

                JButton button = new MarioTheme().getButton();

                if(comboBoxChoix.getSelectedItem() == Choix.Mario){
                    button = new MarioTheme().getButton();
                }
                else{
                    button = new StarWarsTheme().getButton();
                }
            }

    }
