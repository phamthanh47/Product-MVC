package service;

import java.util.List;

public interface GeneralProductService<E> {
    List<E> findAllBussiness();
    void addProductBussiness(E e);
    void updateProductBussiness(E e);
    void deleteProductByIdBussiness(int id);
    List<E> searchProductByNameBussiness(String name);

}
