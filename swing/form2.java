import java.awt.*;

class from2 {
    public static void main(String args[]) {

        Frame f = new Frame("Simple Form");

        Label l1 = new Label("Enter Name:");
        l1.setBounds(50, 50, 80, 30);

        TextField t1 = new TextField();
        t1.setBounds(150, 50, 150, 30);

        Button b1 = new Button("Submit");
        b1.setBounds(150, 100, 80, 30);

        Label l2 = new Label();
        l2.setBounds(50, 150, 200, 30);

        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(l2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}