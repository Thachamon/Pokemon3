public class PokeFood{
	private String name;
	private float energy;
	private int type;

	public PokeFood(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Berry";
				this.energy = 10;
				break;
			case 1: this.name = "Apple";
				this.energy = 15;
				break;
			case 2: this.name = "Pizza";
				this.energy = 30;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.energy;
	}
}
