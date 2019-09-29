
public class CreatureCard extends Card {
	private int power;
	private int health;
	
	public CreatureCard(String n, String t, String r, String exp, String c, String eff, int pow, int hea) {
		super(n, t, r, exp, c, eff);
		power = pow;
		health = hea;
	}
	 
	@Override
	public String toString() {
		String fullCard = super.getName() + "\t\t" + super.getCost()
		+ "\n" + super.getType() + "\t" + super.getRarity() + " " + super.getExpansion()
		+ "\n" + super.getEffect()
		+ "\n" + power + "/" + health
		+ "\n" + super.getNumCards() + " copies.";
		
		return fullCard;
	}

	@Override
	public int compareTo(Object obj) {
		if(this.getName().equals(((Card) obj).getName())) {
			return 0;
		}
		return this.getName().compareTo(((Card) obj).getName());
	}
}
