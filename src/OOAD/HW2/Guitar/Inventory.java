/**
 * Class: Object Oriented Analysis and Design
 * Assignment: 2
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package OOAD.HW2.Guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements properties and functions of inventory
 */

public class Inventory {

	private List<Guitar> guitars;

	/**
	 * Initialize guitars list
	 */
	public Inventory() {
		guitars = new LinkedList();
	}

	/**
	 * The function adds up new guitar to guitars list
	 * 
	 * @param serialNumber
	 * @param price
	 * @param guitarSpec
	 */
	public void addGuitar(String serialNumber, double price,
			GuitarSpec guitarSpec) {
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
		guitars.add(guitar);
	}

	/**
	 * The function gets the serialNumber and compare with guitar list serial
	 * number if there is any match returns guitar object else returns null
	 * 
	 * @param serialNumber
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
	 * The function gets searchGuitar object and compares with the guitarSpec match and getPrice function. 
	 *
	 * @param searchGuitar
	 * @return guitar List 
	 */
	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> guitarsList = new LinkedList(); 
		
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			// This condition checks the guitars spec
			if (guitar.getGuitarSpec()
					.guitarMatch(searchGuitar.getGuitarSpec())) {
				guitarsList.add(guitar);
			}

			// This condition checks the guitars price
			if (guitar.getPrice() == searchGuitar.getPrice()) {
				guitarsList.add(guitar);
			}
		}
		return guitarsList;
	}
}
