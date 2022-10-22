package case_study.furama_resort.facilities;

public abstract class Facility {
    private String idFacility;
    private String nameService;
    private double areUse;
    private int rentalPrice;
    private int rentalPeopleMax;
    private String styleRental;

    public Facility() {
    }

    public Facility(String idFacility,
                    String nameService,
                    double areUse,
                    int rentalPrice,
                    int rentalPeopleMax,
                    String styleRental
    ) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.areUse = areUse;
        this.rentalPrice = rentalPrice;
        this.rentalPeopleMax = rentalPeopleMax;
        this.styleRental = styleRental;

    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreUse() {
        return areUse;
    }

    public void setAreUse(double areUse) {
        this.areUse = areUse;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentalPeopleMax() {
        return rentalPeopleMax;
    }

    public void setRentalPeopleMax(int rentalPeopleMax) {
        this.rentalPeopleMax = rentalPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }


    @Override
    public String toString() {
        return "idFacility='" + idFacility + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areUse=" + areUse +
                ", rentalPrice=" + rentalPrice +
                ", rentalPeopleMax=" + rentalPeopleMax +
                ", styleRental='" + styleRental + '\'';
    }
}
