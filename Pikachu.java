public class Pikachu extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Pikachu(){
		super("Pikachu",
		      (Math.random()*1000) % (maxGroupHealth+1));

		this.attackSkill = PokeSkill.getPokemonSkill("Thunder Shock");

	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedHealth(10);
	}

	public void walk(){
		this.reducedHealth(1);
	}
}