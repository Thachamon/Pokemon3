public class Squirtle extends Pokemon implements Swimmable {
	private static final int maxGroupHealth = 200;
	

	public Squirtle() {
		super("Squirtle",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = PokeSkill.getPokemonSkill("Water Gun");
		this.imgPath="images/Squirtle.gif";
		
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