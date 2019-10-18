package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private static List<Product> productList;
    static {
        productList=new ArrayList<>();
        productList.add(new Product(1,"Samsung",800));
        productList.add(new Product(2,"Nokia",700));
        productList.add(new Product(3,"Oppo",300));
        productList.add(new Product(4,"Iphone",500));
        productList.add(new Product(5,"Blackbery",200));
        productList.add(new Product(6,"Huawei",600));
        productList.add(new Product(7,"HTC",400));
    }
    
    @Override
    public List<Product> findAll() {
        return new ArrayList<Product>(productList);
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList=findAll();
        productList.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        List<Product> productList=findAll();
         for(Product product1:productList){
             if(product.getId()==product1.getId()){
                 product1.setName(product.getName());
                 product1.setPrice(product.getPrice());
             }
         }
    }

    @Override
    public void deleteProductById(int  id) {
        List<Product> productList=findAll();
        List<Product> productList1=new ArrayList<>();
             for(Product product:productList){
                 if(product.getId()==id){
                     productList1.add(product);
                 }
             }
             productList.removeAll(productList1);
    }

    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> productList=findAll();
        List<Product> productList1=new ArrayList<>();
        for(Product product:productList){
            if(name!=null&&product.getName().toLowerCase().contains(name.toLowerCase())){
                productList1.add(product);
            }
        }
        return productList1;
    }
}
