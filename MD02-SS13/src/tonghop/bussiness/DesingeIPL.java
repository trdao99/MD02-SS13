package tonghop.bussiness;

import tonghop.config.InputMethods;

import java.util.ArrayList;
import java.util.List;

public class DesingeIPL implements desgine {
    private static List<Product> productList = new ArrayList<>();

    @Override
    public int getNewId() {
        int idMax = 0;
        for (Product e : productList) {
            if (idMax < e.getId()) {
                idMax = e.getId();
            }
        }
        return idMax + 1;
    }

    @Override
    public void add() {
        System.out.println("nhập số lượng cânf thêm: ");
        byte count = InputMethods.getByte();

        // duyệt
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + i);
            Product products = inputData(true);
            // thêm vào list
            productList.add(products);
        }
    }

    @Override
    public void update() {
        System.out.println("Nhập id của sản phẩm cần sử thông tin");
        int idEdit = InputMethods.getInteger();
        Product productEdit = findById(idEdit);
        if (productEdit == null) {
            System.err.println("Khong tim thay");
        } else {
            // hiển thi thông tin cũ
            System.out.println("thông tin cũ là :");
            System.out.println(productEdit);
            System.out.println("Nhập thông tin mới");
            productEdit = inputData(false);
            productEdit.setId(idEdit); // ko thay đổi id
            // set nó vào danh sách
            productList.set(productList.indexOf(findById(idEdit)), productEdit);
            System.out.println("Đã cập nhật thông tin");
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id của sản phẩm cần xóa");
        int idDel = InputMethods.getInteger();
        Product productDel = findById(idDel);
        if (productDel == null) {
            System.err.println("Khong tim thay");
        } else {
            productList.remove(productDel);
            System.out.println("Xóa thanh công");
        }
    }

    @Override
    public void display() {
        if (productList.isEmpty()) {
            System.err.println("Danh sach rỗng");
        } else {

            System.out.println(productList);
        }
    }


    @Override
    public Product inputData(boolean isAdd) {
        Product newProduct = new Product();
        if (isAdd) {
            newProduct.setId(getNewId()); // id tự tăng
            System.out.println("ID : " + newProduct.getId());
            System.out.println("Nhập tên sản phẩm :");
            newProduct.setName(InputMethods.getString());
            System.out.println("Nhập giá :");
            newProduct.setPrice(InputMethods.getDouble());
        }
        return newProduct;
    }

    @Override
    public Product findById(int id) {
        for (Product e : productList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

}
