package controller;

import model.Product;
import service.ProductService;
import service.ProductSeviceImpl;

import java.util.*;

public class ProductController {
    ProductService productService=new ProductSeviceImpl();
       public List<Product> displayProduct(){
           List<Product> listProduct=productService.findAllBussiness();
           return listProduct;
       }
       public void addProduct(Product product){
           productService.addProductBussiness(product);
       }
       public void updateProduct(Product product){
           productService.updateProductBussiness(product);
       }
       public  void deleteProductById(int id){
           productService.deleteProductByIdBussiness(id);
       }
       public List<Product> searchProductByName(String name){
           return productService.searchProductByNameBussiness(name);
       }
       public  List<Product> sortByPriceASC(){
           List<Product> list=productService.findAllBussiness();
           Collections.sort(list,new Comparator<Product>(){
               @Override
               public int compare(Product o1, Product o2) {
                   Integer price1=o1.getPrice();
                   Integer price2=o2.getPrice();
                   return price1-price2;
               }
           });
           return list;
       }
       public List<Product> sortProductDESC(){
           List<Product> list=productService.findAllBussiness();
           Collections.sort(list, new Comparator<Product>() {
               @Override
               public int compare(Product o1, Product o2) {
                Integer price1=o1.getPrice();
                Integer price2=o2.getPrice();
                return price2-price1;
               }
           }
       );
           return list;
       }
}
