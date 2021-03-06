import java.util.*;
import javax.swing.*;

public class GUIParser {
	private Trainer pokemonTrainer;
	private ArrayList<Pokemon> myPokemons;
	private ArrayList<Pokemon> rivalPokemon;
	private PokeFood pokeFood;
	private GuiPokeStatus pokeStatus;
	//private PokeRandom pokeRandom;
	String Changename = "";
	public GUIParser(String pokemonTrainer) {
		this.pokemonTrainer = new Trainer(pokemonTrainer);
		myPokemons = new ArrayList();
		rivalPokemon = new ArrayList();
	}
	public int selectPokemon(String name) {
		int n = JOptionPane.showConfirmDialog(
			    null,
			    "Would you like "+name+"?",
			    "Would you like ...",
			    JOptionPane.YES_NO_OPTION);
		 if(n==0) {
			 if(name.equals("Snorlax")) {
				 myPokemons.add(new Snorlax());
			 }
			 else if(name.equals("Dragonite")) {
				 myPokemons.add(new Dragonite());
			 }
			 else if(name.equals("Blastoise")) {
				 myPokemons.add(new Blastoise()); 
			 }
		 }
		 return n;
		}

	public  String  printPokemons(){
		String  detail;
		detail="\n----------  Pokemon Trainer : "+pokemonTrainer.getName()+"  ----------\n\n\n";
		if (Changename.length() > 0 ) {detail+="Please call him : " + Changename +"\n";}
		
		for(Pokemon pokemon: myPokemons){
			detail+="Pokemon : "+pokemon.getName()+"\nHealth : "+Math.round(pokemon.getHealth())+"/"+Math.round(pokemon.maxHp)+"\nWeight : "+Math.round(pokemon.getWeight())+" kg\n"+pokemon.printAttackSkill();
		}
		return detail;
	}
	public void feedPokemon(int b) {
		pokeFood = new PokeFood(b);
		for(Pokemon pokemon: myPokemons) {
			pokemon.eat(pokeFood);
		}
	}
	public void excercisePokemon(int b) {
		for(Pokemon pokemon : myPokemons ) {
			if(b==0) {
				pokemon.move();
			}
		}
	}

	 public void changeNamePokemon(String ccName){
		 Changename = ccName;
	 }

	public String getImgPath() {
		return myPokemons.get(0).getImgPath();
	}

	public void dicoverRival() {	
		int randomType = (int)(Math.random()*10);
			if(randomType < 3) {
				rivalPokemon.add(new Pikachu());
			}	
			else {
				rivalPokemon.add(new Koduck());
			} 

					
	}
	public void pokemonBattle() {
		rivalPokemon.get(0).attack(myPokemons.get(0));
	}
	public String getRivalImgPath() {
		return rivalPokemon.get(0).getImgPath();
	}
	public String getRivalPokemonDetail() {
		return rivalPokemon.get(0).getName()+"\n"+rivalPokemon.get(0).printAttackSkill();
	}
}
	