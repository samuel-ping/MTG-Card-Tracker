
public class SpellCard extends Card {

	public SpellCard(String n, String t, String r, String exp, String c, String eff) {
		super(n, t, r, exp, c, eff);
	}
	 
	@Override
	public String toString() {
		String fullCard = super.getName() + "\t\t" + super.getCost()
		+ "\n" + super.getType() + "\t" + super.getRarity() + " " + super.getExpansion()
		+ "\n" + super.getEffect()
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
