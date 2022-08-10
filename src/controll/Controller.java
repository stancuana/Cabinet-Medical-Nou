package controll;

public interface Controller {

    void load();
    void afisare();
    void add(Object obj);
    int nextAvailableId();
    void update(Object obj);
    void delete(int id);
}
