import javax.swing.JOptionPane;
public class lab2 {
    public static void main(String[] args){
        String myname,msg;
        myname = JOptionPane.showInputDialog(null,"key in your name:");
        msg = "Hello " + myname + "How is Java?";
        JOptionPane.showMessageDialog(null,msg);
    }
}
