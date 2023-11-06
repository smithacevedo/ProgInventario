import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuarios {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        JLabel idLabel = new JLabel("Usuario ID:");
        JTextField idTextField = new JTextField();
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameTextField = new JTextField();
        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField();
        JLabel roleLabel = new JLabel("Rol:");
        JTextField roleTextField = new JTextField();

        JButton submitButton = new JButton("Enviar");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userId = idTextField.getText();
                String userName = nameTextField.getText();
                String password = new String(passwordField.getPassword());
                String role = roleTextField.getText();

                // Aquí puedes realizar acciones con los datos, como almacenarlos en una base de datos o imprimirlos en la consola.
                System.out.println("Usuario ID: " + userId);
                System.out.println("Nombre: " + userName);
                System.out.println("Contraseña: " + password);
                System.out.println("Rol: " + role);
            }
        });

        frame.add(idLabel);
        frame.add(idTextField);
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(roleLabel);
        frame.add(roleTextField);
        frame.add(new JLabel()); // Espacio en blanco
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
