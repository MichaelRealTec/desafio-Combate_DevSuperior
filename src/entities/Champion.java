package entities;

public class Champion {
	// Atributos
	private String name;
	private int life;
	private int attack;
	private int armor;

	// Métodos Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	// Construtor
	public Champion() {

	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	// Métodos

	public void takeDamage(Champion other) {
		if (other.attack <= armor) {
			life--;
		} else {
			life = life - (other.attack - armor);
		}
	}

	public String status() {
		if (life <= 0) {
			return name + ": " + life + " de vida (morreu)";
		}
		return name + ": " + life + " de vida";
	}

}
