public class Blastoise extends Pokemon implements Swimmable {
	private static final int maxGroupHealth = 200;
	

	public Blastoise() {
		super("Blastoise",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = PokeSkill.getPokemonSkill("Water Gun");
		this.imgPath="images/blastoise.gif";
		
	}

	@Override
	public void swim() {
		
		this.reducedHealth(30);
	}

	@Override
	public void move() {
		
		this.swim();
	}
	

}