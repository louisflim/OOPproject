import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class tempConvertProject extends JFrame{
    private JPanel mainPanel;
    private JComboBox<String> tempComboBox;
    private JTextField tempTextField;
    private JButton convertButton;
    private JTextField resultTextField;
    private JLabel titleLabel;
    private JLabel subtitleJLabel;

    public tempConvertProject() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input = Double.parseDouble(tempTextField.getText());
                    double output;

                    if (Objects.equals(tempComboBox.getSelectedItem(), "Celsius to Fahrenheit")) {
                        output = (input * 9 / 5) + 32;
                    } else if (Objects.equals(tempComboBox.getSelectedItem(), "Fahrenheit to Celsius")) {
                        output = (input - 32) * 5 / 9;
                    } else {
                        output = 0;
                    }

                    resultTextField.setText(String.format("%.2f", output));
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "INVALID NUMBER INPUT");
                }
            }
        });
    }

    public static void main(String[] args) {
        tempConvertProject app = new tempConvertProject();
        app.setContentPane(app.mainPanel);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setSize(800,500);
        app.setVisible(true);
    }
}
