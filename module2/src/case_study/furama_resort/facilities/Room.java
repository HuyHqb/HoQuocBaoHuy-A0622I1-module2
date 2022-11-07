package case_study.furama_resort.facilities;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String idFacility,
                String nameService,
                double areUse,
                int rentalPrice,
                int rentalPeopleMax,
                String styleRental,
                String freeService) {
        super(idFacility, nameService, areUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public Room(String string) {
        String[] data = string.split(",");
        setIdFacility(data[0]);
        setNameService((data[1]));
        setAreUse(Double.parseDouble(data[2]));
        setRentalPrice(Integer.parseInt(data[3]));
        setRentalPeopleMax(Integer.parseInt(data[4]));
        setStyleRental(data[5]);
        setFreeService(data[6]);
    }


    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                " freeService='" + freeService + '\'' +
                '}';
    }

    public String getInfo() {
        return getIdFacility() + "," + getNameService() + "," + getAreUse() + "," + getRentalPrice() + "," + getRentalPeopleMax() + "," + getStyleRental() + "," + getFreeService();
    }
}
