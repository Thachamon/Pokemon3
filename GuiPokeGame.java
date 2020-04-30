import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiPokeGame extends JFrame{
    private GUIParser guiParser;
	private JPanel p;
	private JButton btnStart;
	private JLabel lblName;
	private JLabel lblWelcome;
    private JTextField tfName;
    Font titleFont = new Font("Tahoma", Font.PLAIN, 70);


	public GuiPokeGame(String title) {
		super(title);
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		lblWelcome = new JLabel("POKEMON GAME");
		lblName = new JLabel("Enter your name :");
		tfName	= new JTextField(18);
		btnStart = new JButton("PRESS START");

		
		GuiPanel gc = new GuiPanel();

		//gc.addItem(p,lblWelcome,0,0,3,1,GridBagConstraints.NORTH);
		gc.addItem(p,lblName,0,1,1,1,GridBagConstraints.WEST);
		gc.addItem(p,tfName,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnStart,1,2,1,1,GridBagConstraints.CENTER);
		
		btnStart.addActionListener(new ButtonListener());
        
        lblWelcome.setBounds(130,50,600,60);
        lblWelcome.setFont(titleFont);
        add(lblWelcome);

          
        p.setBackground(Color.black);
        add(p); 
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnStart && tfName.getText().length()>0) {			
					GuiPokeSelect frame = new GuiPokeSelect("Pokemon Select",tfName.getText());
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(800,600);
					frame.setVisible(true);
					dispose();
				}
				else {
					
				}
		}
	}
	public static void main(String[] args) {
		GuiPokeGame guiPokeGame = new GuiPokeGame("POKEMON GEME");
        guiPokeGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //guiPokeGame.setBackground(Color.black);
        //guiPokeGame.setForeground(Color.white);
		guiPokeGame.setSize(800,600);
		guiPokeGame.setVisible(true);
		
	}
}