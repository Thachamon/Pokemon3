abstract class Pokemon{
	public final double maxHp;
	protected double health;
	protected double weight;
	protected String name;
	protected PokeSkill attackSkill;
	protected PokeSkill untimatedSkill;
	protected String imgPath;

	public Pokemon(String name, double maxHp){
		this.name = name;
		this.health = maxHp;
		this.maxHp = maxHp;
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
	public void eat(PokeFood pokeFood){
		this.health += pokeFood.getRestoreValue();
		if(this.health > this.maxHp)
			this.health = this.maxHp;
		this.weight++;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}


	public void injure(PokeSkill skill){
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
