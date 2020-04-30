public class Koduck extends Pokemon implements Swimmable {
	private static final int maxGroupHealth = 200;

	public Koduck() {
		super("Koduck",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = PokeSkill.getPokemonSkill("Water Gun");
		this.untimatedSkill = PokeSkill.getPokemonSkill("Surf");
		
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