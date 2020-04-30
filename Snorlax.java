public class Snorlax extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Snorlax() {
		super("Snorlax",
			      (Math.random()*1000) % (maxGroupHealth+1));

			this.attackSkill = PokeSkill.getPokemonSkill("Solar Beam");
			this.imgPath = "/images/snorlax.gif";
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