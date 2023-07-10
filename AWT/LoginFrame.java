import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Frame implements ActionListener {
    private Label lblUsername, lblPassword;
    private TextField txtUsername, txtPassword;
    private Button btnOk, btnReset;
    public LoginFrame() {
        setTitle("Login");
        setLayout(new FlowLayout());
        setSize(300, 200);

        lblUsername = new Label("Username:");
        add(lblUsername);

        txtUsername = new TextField(20);
        add(txtUsername);

        lblPassword = new Label("Password:");
        add(lblPassword);

        txtPassword = new TextField(20);
        txtPassword.setEchoChar('*');
        add(txtPassword);

        btnOk = new Button("OK");
        btnOk.addActionListener(this);
        add(btnOk);

        btnReset = new Button("Reset");
        btnReset.addActionListener(this);
        add(btnReset);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            // Perform login validation here

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else if (e.getSource() == btnReset) {
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
