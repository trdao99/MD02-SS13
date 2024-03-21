package tonghop.presentation;

import tonghop.bussiness.DesingeIPL;
import tonghop.bussiness.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public static void main(String[] args) {
        DesingeIPL desingeIPL = new DesingeIPL();
        desingeIPL.add();
        desingeIPL.display();
        desingeIPL.delete();
        desingeIPL.display();
        desingeIPL.update();
        desingeIPL.display();
    }
}
