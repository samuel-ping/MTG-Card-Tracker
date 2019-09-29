import java.util.Iterator;
import java.util.TreeSet;


public class CardCollection {
	private TreeSet<Card> cardSet;
	
	public CardCollection() {
		cardSet = new TreeSet<Card>();
	}
	
	/*
	 * Adds a new card to the TreeSet cardSet
	 */
	public void addNewCard(Card input) {
			input.incrementNumCards();
			cardSet.add(input);
	}
	
	/*
	 * Increments the number of cards that already exists for this card
	 */
	public void incrementACard(String name) {
		Iterator<Card> iter = cardSet.iterator();
		Iterator<Card> iter2 = cardSet.iterator();

		while(iter.hasNext()) {
			if(iter.next().getName().equals(name)) {
				iter2.next().incrementNumCards();
				break;
			} else {
				iter2.next(); // iter2 moves along the TreeSet with iter
			}
		}
	}
	
//	public boolean containsExpansion(String name, String expansion) {
//		Iterator<Card> iter = cardSet.iterator();
//		Iterator<Card> iter2 = cardSet.iterator();
//		Iterator<Card> iter3 = cardSet.iterator();
//		boolean hasExpansion = false;
//
//		while(iter.hasNext()) {
//			if(iter.next().getName().equals(name) && iter2.next().getExpansion().equals(expansion)) {
//				hasExpansion = true;
//			} else {
//				iter3.next(); // iter3 moves along the TreeSet with iter and iter2
//			}
//		}
//		
//		return hasExpansion;
//	}
	
	/*
	 * Checks if card already exists in the TreeSet
	 */
	public boolean checkCard(String name) {
		Iterator<Card> iter = cardSet.iterator();
		boolean hasCard = false;
		
		while(iter.hasNext()) {
			if(name.equals(iter.next().getName())) {
				hasCard = true;
			}
		}
		
		return hasCard;
	}
	
	public String toString() {
		Iterator<Card> iter =  cardSet.iterator();
		String output = "";
		
		while(iter.hasNext()) {
			output += iter.next().toString() + "\n\n";
		}
		
		return output;
	}
}
