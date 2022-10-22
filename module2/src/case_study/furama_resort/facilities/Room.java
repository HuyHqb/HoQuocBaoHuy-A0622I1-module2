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
}
