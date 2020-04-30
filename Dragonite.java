public class Dragonite extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Dragonite() {
		super("Dragonite",
			      (Math.random()*1000) % (maxGroupHealth+1));

			this.attackSkill = PokeSkill.getPokemonSkill("Fire Ball");
			//this.imgPath="images/snorlax.gif";
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