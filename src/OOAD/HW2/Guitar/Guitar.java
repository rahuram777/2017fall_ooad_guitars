/**
 * Class: Object Oriented Analysis and Design
 * Professor: Orlando Montalvo
 * Assignment: 2
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package OOAD.HW2.Guitar;

/**
 * Guitar class implements the properties and functions of Guitar.
 *
 */
public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec guitarSpec;

	/**
	 * Constructor for the class Guitar with the following arguments
	 * @param serialNumber Guitar serial number
	 * @param price Guitar price
	 * @param guitarSpec Guitar specs
	 */
	public Guitar(String serialNumber, double price, 
			GuitarSpec guitarSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}

	/**
	 *
	 * @return serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 *
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param newPrice
	 *            
	 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	/**
	 * 
	 * @return guitarSpec
	 */
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
}
