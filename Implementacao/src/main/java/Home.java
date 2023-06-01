import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    private JPanel home;
    private JList list1;
    private JList list2;
    private JButton editarEventoButton;
    private JButton criarEventoButton;
    private JButton eliminarEventoButton;
    private JButton verInscriçõesButton;
    private JButton verHistóricoButton;
    private JButton criarAtletaButton;
    private JButton editarAtletaButton;
    private JButton sairButton;
    private JButton importarEventosButton;
    private JButton importarAtletasButton;
    private JButton verPaísesMaisMedalhadosButton;
    private JButton temporarioVerProvaButton;

    public Home(String title) {
        super(title);
        setContentPane(home);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


}