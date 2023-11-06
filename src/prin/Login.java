import javax.swing.*;

public class Login {

    //Autor: Jeison Acevedo
    //15-10-2023
    public static void main(String[] args) {
        // Crear un nuevo marco (ventana) de la aplicación
        JFrame frame = new JFrame("Login");
        
        // Crear etiquetas para usuario y contrasenia
        JLabel usuarioLabel = new JLabel("Usuario:");
        JLabel contraseniaLabel = new JLabel("Contraseña:");
        
        // Crear campos de texto para ingresar usuario y contrasenia
        JTextField usuarioTextField = new JTextField(20);
        // Utiliza JPasswordField para el campo de contraseña
        JPasswordField contraseniaField = new JPasswordField(20);
        
        // Crear un botón para enviar el formulario
        JButton enviarButton = new JButton("Enviar");
        
        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        
        // Agregar los componentes al panel
        panel.add(usuarioLabel);
        panel.add(usuarioTextField);
        panel.add(contraseniaLabel);
        panel.add(contraseniaField);
        panel.add(enviarButton);
        
        // Agregar el panel al marco
        frame.add(panel);
        
        // Configurar el tamaño y la operación de cierre
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hacer visible el marco
        frame.setVisible(true);
    }
}