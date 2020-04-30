import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class GuiPokeSelect extends JFrame{
	private JPanel p;
	private JLabel lblHeader;
	private JLabel lblS;
	private JLabel lblD;
	private JLabel lblB;
	private JButton btnS;
	private JButton btnD;
	private JButton btnB;
    private GUIParser guiParser;
    Font mFont = new Font("Comic Sans MS", Font.PLAIN, 20);
    Font tFont = new Font("Comic Sans MS", Font.PLAIN, 16);
    
	public GuiPokeSelect (String title,String pokemonTrainer) {
		super(title);
        guiParser = new GUIParser(pokemonTrainer); 
        
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		btnS = new JButton();
		btnD= new JButton();
		btnB= new JButton();
		lblHeader = new JLabel("Select First Pokemon");
		lblS = new JLabel("Snorlax");
		lblD = new JLabel("Dragonite");
		lblB = new JLabel("Blastoise");
		 btnS.setIcon(new ImageIcon("images/snorlax.gif"));
		btnS.setPreferredSize(new Dimension(250,300));
		btnD.setIcon(new ImageIcon("images/dragonite.gif"));
		btnD.setPreferredSize(new Dimension(250,300));
		btnB.setIcon(new ImageIcon("images/blastoise.gif"));
		btnB.setPreferredSize(new Dimension(250,300));
		//validate();

		
		GuiPanel gc = new GuiPanel();
		gc.addItem(p,lblHeader,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnS,0,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnD,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnB,2,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblS,0,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblD,1,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblB,2,2,1,1,GridBagConstraints.CENTER);
		
		btnS.addActionListener(new ButtonListener());
		btnD.addActionListener(new ButtonListener());
        btnB.addActionListener(new ButtonListener());

        lblB.setFont(tFont);
        lblB.setForeground(Color.YELLOW);
        lblD.setFont(tFont);
        lblD.setForeground(Color.YELLOW);
        lblS.setFont(tFont);
        lblS.setForeground(Color.YELLOW);
        lblHeader.setFont(mFont);
        lblHeader.setForeground(Color.PINK);
        p.setBackground(Color.black);
		add(p);
		
    }
    
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				int n=1; 
				if(e.getSource()==btnS){
					n=guiParser.selectPokemon("Snorlax");
				}
				else if(e.getSource()==btnD){
					n=guiParser.selectPokemon("Dragonite");
				}
				else if(e.getSource()==btnB){
					n=guiParser.selectPokemon("Blastoise");
				}
	
				if(n==0) {
					GuiPokeStatus frame = new GuiPokeStatus("Main Menu", guiParser);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(800,600);
					frame.setVisible(true);
					dispose();
				}
				
				
			
		}
	}
}