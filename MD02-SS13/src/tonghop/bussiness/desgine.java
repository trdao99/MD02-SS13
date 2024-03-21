package tonghop.bussiness;

public interface desgine {
    void add();
    void update();
    void delete();
    void display();
    int getNewId();
    Product inputData(boolean isAdd);
    Product findById(int id);
}
