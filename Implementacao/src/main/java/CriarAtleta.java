import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriarAtleta extends JFrame{
    private JPanel atleta;
    private JTextArea primeiroNomeTextArea;
    private JTextArea últimoNomeTextArea;
    private JTextArea paísTextArea;
    private JTextArea cinturãoTextArea;
    private JTextArea géneroTextArea;
    private JTextArea pesoTextArea;
    private JTextArea telefoneTextArea;
    private JTextField textFieldPrimerioNome;
    private JTextField textField2UltimoNome;
    private JTextField textField1Pais;
    private JTextField textField3Cinturao;
    private JTextField textField4Genro;
    private JTextField textField5Peso;
    private JTextField textField6Telefone;
    private JButton inserirButton;
    private JButton cancelarButton;


    public CriarAtleta(String title){
        super(title);
        setContentPane(atleta);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Fazer o ACAO VOLTAR PARA TRAS
            }
        });
    }

    public static void main(String[] args) {
        new CriarAtleta("Criar Atleta").setVisible(true);
    }

}
