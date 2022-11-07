package case_study.furama_resort.models;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {

    }

    public Customer(int id,
                    String name,
                    String age,
                    String sex,
                    String idCard,
                    String email,
                    String type,
                    String address) {
        super(id, name, age, sex, idCard, email);
        this.type = type;
        this.address = address;
    }

    public Customer(String string) {
        String[] data = string.split(",");
        setId(Integer.parseInt(data[0]));
        setName((data[1]));
        setAge((data[2]));
        setSex(data[3]);
        setIdCard(data[4]);
        setEmail(data[5]);
        setType(data[6]);
        setAddress(data[7]);

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

    public String getInfo() {
        return getId() + "," + getName() + "," + getAge() + "," + getSex() + "," + getIdCard() + "," + getEmail() + "," + getType() + "," + getAddress();
    }
}
