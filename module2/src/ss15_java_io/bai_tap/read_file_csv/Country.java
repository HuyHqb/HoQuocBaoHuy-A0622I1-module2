package ss15_java_io.bai_tap.read_file_csv;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(String string) {
        String[] data = string.split(",");
        setId(Integer.parseInt(data[0]));
        setCode(data[1]);
        setName((data[2]));
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getInfo() {
        return getId() + "," + getCode() + "," + getName();
    }
}
