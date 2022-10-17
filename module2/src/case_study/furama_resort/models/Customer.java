package case_study.furama_resort.models;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {

    }

    public Customer(int id,
                    String name,
                    int age,
                    String sex,
                    String idCard,
                    String email,
                    String type,
                    String address) {
        super(id, name, age, sex, idCard, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
