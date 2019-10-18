package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductSeviceImpl implements ProductService {
    ProductRepository productRepository=new ProductRepositoryImpl();

    @Override
    public List<Product> findAllBussiness() {
        return productRepository.findAll();
    }

    @Override
    public void addProductBussiness(Product product) {
       productRepository.addProduct(product);
    }

    @Override
    public void updateProductBussiness(Product product) {
  productRepository.updateProduct(product);
    }

    @Override
    public void deleteProductByIdBussiness(int id) {
          productRepository.deleteProductById(id);
    }

    @Override
    public List<Product> searchProductByNameBussiness(String name) {
        return productRepository.searchProductByName(name);
    }
}
