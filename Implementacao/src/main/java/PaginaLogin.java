
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaLogin extends JFrame {

    private JPanel painelLogin;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea emailTextArea;
    private JTextArea passwordTextArea;
    private JButton loginButton;
    private JButton sairButton;

    public PaginaLogin(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelLogin);
        pack();
        sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Home("Home/Dashboard");
            }
        });
    }
    public static void main(String[] args) {
        new PaginaLogin("Gestão Jiu-Jitsu").setVisible(true);
    }
}