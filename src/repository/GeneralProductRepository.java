package repository;

import java.util.List;

public interface GeneralProductRepository<E> {
    List<E>  findAll();
    void addProduct(E e);
    void updateProduct(E e);
    void deleteProductById(int id);
    List<E> searchProductByName(String name);



}
