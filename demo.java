import javax.swing.*;

class demo{
    public static void main(String[] args){

        JFrame frame = new JFrame("Test Demo");
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        //file menu with open and save options
        JMenu filename = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        filename.add(open);
        filename.add(save);
        menuBar.add(filename);

        //edit menu with cut, copy and paste options
        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        menuBar.add(edit);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}