abstract class Pokemon{
	public final double maxHealth;
	protected double health;
	protected double weight;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;
	protected String imgPath;

	public Pokemon(String name, double maxHealth){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
		this.weight = (Math.random()*10)+1;
	}
	public double getHealth(){
		return this.health;
	}
	public String getName(){
		return this.name;
	}
	public double getWeight(){
		return this.weight;
	}
	public String printAttackSkill() {
		return "AttackSkill : "+attackSkill.getName()+" , Damage : "+attackSkill.getDamage();
	}
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
		this.weight++;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}


	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health < 0)
			this.health = 0;
	}
	public String getImgPath() {
		return this.imgPath;
	}

	abstract public void move();
	

}
