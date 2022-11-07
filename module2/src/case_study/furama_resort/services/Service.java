package case_study.furama_resort.services;

import java.io.IOException;

public interface Service {
    void display();

    void addNew() throws IOException;

    void edit();

    void delete();
}
