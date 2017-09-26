/**
 * Class: Object Oriented Analysis and Design
 * Professor: Orlando Montalvo
 * Assignment: 2
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package OOAD.HW2.Guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Inventory class implements properties such as add, get and search functions of Guitar.
 */

public class Inventory {

	private List<Guitar> guitars;

	/**
	 * Constructor - creates new guitar inventory
	 */
	public Inventory() {
		guitars = new LinkedList();
	}

	/**
	 * Adds a new guitar to the guitar inventory 
	 * 
	 * @param serialNumber Guitar serial number
	 * @param price Guitar price 
	 * @param guitarSpec Guitarspec 
	 */
	public void addGuitar(String serialNumber, double price,
			GuitarSpec guitarSpec) {
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
		guitars.add(guitar);
	}

	/**
	 * Searches and returns the guitar object if it matches the provided guitar serialnumber. 
	 * else returns null
	 * 
	 * @param serialNumber Guitar serial number
	 * @return guitar object or null
	 */
	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	/**
	 * Searches and returns guitars that match the provided guitar spec.  
	 *
	 * @param searchGuitar Guitar object
	 * @return guitars list or null
	 */
	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> guitarsList = new LinkedList(); 
		
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			//  Checks the provided guitar spec 
			if (guitar.getGuitarSpec()
					.guitarMatch(searchGuitar.getGuitarSpec())) {
				guitarsList.add(guitar);
			}

			// Checks the provided guitars price
			if (guitar.getPrice() == searchGuitar.getPrice()) {
				guitarsList.add(guitar);
			}
		}
		return guitarsList;
	}
}
