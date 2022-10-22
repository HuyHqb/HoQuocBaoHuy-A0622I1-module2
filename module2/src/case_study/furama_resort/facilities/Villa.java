package case_study.furama_resort.facilities;

public class Villa extends Facility {
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa() {
    }


    public Villa(String idFacility,
                 String nameService,
                 double areUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double areaPool,
                 int floor
    ) {
        super(idFacility, nameService, areUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                " standardVilla='" + standardVilla + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }
}
