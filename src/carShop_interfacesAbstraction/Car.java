package carShop_interfacesAbstraction;

public interface Car {
    public static final Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
