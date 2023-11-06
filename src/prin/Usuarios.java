import javax.swing.*;

import config.Conexion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;;

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

                insertUsuario(userId, userName, password, role);
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

    // Método para insertar un usuario en la tabla
    private static void insertUsuario (String userId, String userName, String password, String role){
        Conexion conexion = new Conexion();
        try (Connection connection = conexion.getConnection()) {
            String insertQuery = "INSERT INTO USUARIOS (UsuarioId, Nombre, Contraseña, Rol) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, userName);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, role);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}}