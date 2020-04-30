import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;

public class GuiPokeSelect extends JFrame{
	private JPanel p;
	private JLabel lblHeader;
	private JLabel lblB;
	private JLabel lblH;
	private JLabel lblS;
	private JButton btnB;
	private JButton btnH;
	private JButton btnS;
    private GUIParser guiParser;
    
	public GuiPokeSelect (String title,String pokemonTrainer) {
		super(title);
        guiParser = new GUIParser(pokemonTrainer); 
        
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		btnB = new JButton();
		btnH= new JButton();
		btnS= new JButton();
		lblHeader = new JLabel("Select First Pokemon");
		lblB = new JLabel("Snorlax");
		lblH = new JLabel("Dragonite");
		lblS = new JLabel("Blastoise");
		 btnB.setIcon(new ImageIcon("images/snorlax.gif"));
		btnB.setPreferredSize(new Dimension(250,300));
		btnH.setIcon(new ImageIcon("images/dragonite.gif"));
		btnH.setPreferredSize(new Dimension(250,300));
		btnS.setIcon(new ImageIcon("images/blastoise.gif"));
		btnS.setPreferredSize(new Dimension(250,300));
		//validate();

		
		GuiPanel gc = new GuiPanel();
		gc.addItem(p,lblHeader,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnB,0,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnH,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnS,2,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblB,0,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblH,1,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblS,2,2,1,1,GridBagConstraints.CENTER);
		
		
        p.setBackground(Color.black);
		add(p);
		
	}
	
}