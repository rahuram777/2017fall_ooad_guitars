/**
 * Class: Object Oriented Analysis and Design
 * Professor: Orlando Montalvo
 * Assignment: 1
 * Students: Raghuram Rangaraju (@01377909)
 */

/**
 * Guitar class implements the properties and functions of Guitar.
 */
public class Guitar {

    private String serialNumber, builder, model, type, backWood, topWood;
    private double price;

    /**
     * Constructor for the class Guitar with the following arguments
     * @param serialNumber Guitar's serial number
     * @param price Guitar's serial price
     * @param builder Guitar's serial builder
     * @param model Guitar's serial model
     * @param type Guitar's serial type
     * @param backWood Guitar's serial backwood
     * @param topWood Guitar's serial topwood
     */
    
    public Guitar(String serialNumber, double price,
            String builder, String model, String type,
            String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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
     * @param newPrice new price of guitar
     */
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    /**
     * @return builder
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @return Backwood
     */
    public String getBackWood() {
        return backWood;
    }

    /**
     * @return topWood
     */
    public String getTopWood() {
        return topWood;
    }
}
