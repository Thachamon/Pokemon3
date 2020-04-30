public class PokeSkill{
	private String name;
	private float damage;

	public PokeSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokeSkill getPokemonSkill(String name){
		PokeSkill skill = null;
		switch(name.toLowerCase()){
			case "thunder shock":
				skill = new PokeSkill("Thunder Shock",40);
				break;
			case "thunderbolt":
				skill = new PokeSkill("Thunderbolt",90);
				break;
			case "tail whip":
				skill = new PokeSkill("Tail Whip",10);
				break;
			case "water pulse":
				skill = new PokeSkill("Water Pulse",100);
				break;
			case "water gun":
				skill = new PokeSkill("Water Gun", 60);
				break;
			case "surf":
				skill = new PokeSkill("Surf", 70);
				break;
			case "fire ball":
				skill = new PokeSkill("Fire Ball", 60);
				break;
			case "solar beam":
				skill = new PokeSkill("Solar Beam", 80);
				break;
		}
		return skill;
	}
}