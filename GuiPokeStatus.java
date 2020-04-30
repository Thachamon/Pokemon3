import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiPokeStatus extends JFrame{
	private GUIParser guiParser;
	private JPanel p;
	private JLabel lblHeader;
	private JButton btnEat;
	private JButton btnStudy;
	private JButton btnFight;
	private JButton btnChangeName;
	private JTextField cName;

	private JComboBox<String> cbFood;
	private JTextArea taDetail;
	private JLabel imgLabel;
	Font tFont = new Font("Comic Sans MS", Font.PLAIN, 30);
	Font mFont = new Font("Comic Sans MS", Font.PLAIN, 16);


	public GuiPokeStatus (String title,GUIParser guiParser){
		super(title);
		this.guiParser=guiParser;
		guiParser.dicoverRival();
		guiParser.printPokemons();
		p = new JPanel();
		p.setLayout(new GridBagLayout());
		lblHeader = new JLabel("POKEMON STATUS");
		btnEat = new JButton("EAT!!");
		btnStudy = new JButton("STUDY");
		btnFight = new JButton("FIGHT");
		taDetail = new JTextArea(13,3);
		imgLabel = new JLabel(new ImageIcon(guiParser.getImgPath())); 

		btnChangeName = new JButton("Change Pokemon Name");
		cName	= new JTextField(18);
		
		String [] foodList = {"Berry","Apple","Pizza"};
		cbFood = new JComboBox(foodList);
		
		
		GuiPanel gc = new GuiPanel();

		gc.addItem(p,lblHeader,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,taDetail,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,imgLabel,0,1,1,1,GridBagConstraints.CENTER);

		gc.addItem(p,cbFood,0,2,1,1,GridBagConstraints.WEST);
		gc.addItem(p,btnEat,0,3,1,1,GridBagConstraints.WEST);

		gc.addItem(p,btnStudy,0,2,1,1,GridBagConstraints.EAST);
		gc.addItem(p,btnFight,0,3,1,1,GridBagConstraints.EAST);
		
		gc.addItem(p, cName, 1,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnChangeName, 1,3,1,1,GridBagConstraints.CENTER);
	
		taDetail.setText(guiParser.printPokemons());
		btnEat.addActionListener(new ButtonListener());
		btnStudy.addActionListener(new ButtonListener());
		btnFight.addActionListener(new ButtonListener());
		btnChangeName.addActionListener(new ButtonListener());

		lblHeader.setFont(tFont);
		lblHeader.setForeground(Color.PINK);
		taDetail.setFont(mFont);
		taDetail.setForeground(Color.BLUE);

		p.setBackground(Color.black);
		add(p);
	
	}

	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnEat) {			
					guiParser.feedPokemon(cbFood.getSelectedIndex());
					taDetail.setText(guiParser.printPokemons());
				}

				else if(e.getSource()==btnStudy){
					guiParser.excercisePokemon(0);
					taDetail.setText(guiParser.printPokemons());
				}

				else if(e.getSource()==btnFight){
					JOptionPane.showMessageDialog(null,
						    "Pokemon Rival is : "+guiParser.getRivalPokemonDetail(),
						    "PokemonRival",
						    JOptionPane.INFORMATION_MESSAGE);
					guiParser.pokemonBattle();
					taDetail.setText(guiParser.printPokemons());
				}

				else if(e.getSource() ==btnChangeName && cName.getText().length()>0 ){
					String data =cName.getText();
					
					guiParser.changeNamePokemon(data);
					taDetail.setText(guiParser.printPokemons());
				}
		}
    }
}