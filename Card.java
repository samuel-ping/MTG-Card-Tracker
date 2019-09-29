import java.lang.Comparable;

abstract class Card implements Comparable<Object> {
	private String name;
	private String type;
	private String rarity;
	private String expansion;
	private String cost;
	private String effect;
	private int numCards;
	
	public Card(String n, String t, String r, String exp, String c, String eff) {
		this.name = n;
		this.type = t;
		this.rarity = r;
		this.expansion = exp;
		this.cost = c;
		this.effect = eff;
		numCards = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getRarity() {
		return rarity;
	}
	
	public String getExpansion() {
		return expansion;
	}
	
	public String getCost() {
		return cost;
	}
	
	public String getEffect() {
		return effect;
	}
	
	public int getNumCards() {
		return numCards;
	}
	
	public void incrementNumCards() {
		numCards++;
	}
	
	public int compareTo(Card obj) {
		if(this.getName().equals(obj.getName())) {
			return 0;
		}
		return this.getName().compareTo(obj.getName());
	}
	
	public abstract String toString();
}
