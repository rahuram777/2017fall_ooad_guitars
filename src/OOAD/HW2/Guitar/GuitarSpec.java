/**
 * Class: Object Oriented Analysis and Design
 * Assignment: 2
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package OOAD.HW2.Guitar;

/**
 * This class implements properties and functions of GuitarSpec. And enum for the attributes
 * 
 */
public class GuitarSpec {

    public enum BackWoodandtopWood {
        IndianRosewood, BrazilianRosewood, Mahogany, Maple, Cocobolo, Cedar, Adirondack, Alder, Sitka;

        public String toString() {
            switch (this) {
                case IndianRosewood:
                    return "IndianRosewood";
                case BrazilianRosewood:
                    return "BrazilianRosewood";
                case Mahogany:
                    return "Mahogany";
                case Maple:
                    return "Maple";
                case Cocobolo:
                    return "Cocobolo";
                case Cedar:
                    return "Cedar";
                case Adirondack:
                    return "Adirondack";
                case Alder:
                    return "Alder";
                case Sitka:
                    return "Sitka";
                default:
                    return "notavailable";
            }
        }
    }

    public enum Builder {
        Fender, Martin, Gibson, Collings, Olson, Ryan, PRS;

        public String toString() {
            switch (this) {
                case Fender:
                    return "Fender";
                case Martin:
                    return "Martin";
                case Gibson:
                    return "Gibson";
                case Collings:
                    return "Collings";
                case Olson:
                    return "Olson";
                case Ryan:
                    return "Ryan";
                case PRS:
                    return "PRS";
                default:
                    return "notavailable";

            }
        }
    }

    public enum Type {
        Acoustic, Electric;

        public String toString() {
            switch (this) {
                case Acoustic:
                    return "Acoustic";
                case Electric:
                    return "Electric";
                default:
                    return "notavailable";
            }
        }
    }

    private Builder builder;
    private BackWoodandtopWood backWood;
    private BackWoodandtopWood topWood;
    private Type type;
    private String model;

    /**
     * Constructor for the class GuitarSpec with the following arguments
     * @param builder
     * @param backWood
     * @param topWood
     * @param type
     * @param model
     */
    public GuitarSpec(Builder builder, BackWoodandtopWood backWood,
            BackWoodandtopWood topWood, Type type, String model) {
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.model = model;
    }

    /**
     *
     * @return builder
     */
    public Builder getBuilder() {
        return builder;
    }

    /**
     *
     * @return backWood
     */
    public BackWoodandtopWood getBackWood() {
        return backWood;
    }

    /**
     *
     * @return topWood
     */
    public BackWoodandtopWood gettopWood() {
        return topWood;
    }

    /**
     *
     * @return type
     */
    public Type getType() {
        return type;
    }

    /**
     *
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * Checks the specs if anyone attribute matches returns true. else false
     * @param specs
     * @return true or false
     */
    public boolean guitarMatch(GuitarSpec specs) {
        if ((builder == specs.builder) || (type == specs.type) || (backWood == specs.backWood) || (topWood == specs.topWood) || (model.toLowerCase().equals(specs.model.toLowerCase()))) {
            return true;
        }
        return false;
    }

}
