package view;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import controller.ProductController;
import model.Product;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController=new ProductController();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chuong trinh quan ly san pham");
        int choice;
        do{
            menu();
            choice=scanner.nextInt();
            switch (choice){
                case 0: System.exit(0);
                case 1:{
                   List<Product> productList= productController.displayProduct();
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + " NAME: " + product.getName() + " PRICE: " + product.getPrice());
                    }
                   break;
                }
                case 2:{
                    System.out.println("Add product:");
                    Product productbject=InputProduct();
                    productController.addProduct(productbject);
                    break;
                }
                case 3:{
                    System.out.println("sua san pham");
                    Product product=InputProduct();
                    productController.updateProduct(product);
                    break;
                }
                case 4:{
                    System.out.println("xoa san pham theo id: ");
                    int id= scanner.nextInt();
                    productController.deleteProductById(id);
                    break;
                }
                case 5:{
                    System.out.println("tim kiem san pham theo ten ");
                    String name=scanner.nextLine();
                    productController.searchProductByName(name);
                    break;
                }
                case 6:{
                    System.out.println("sap xep san pham theo thu tu tang dan: ");
                    productController.sortByPriceASC();
                    break;
                }
                case 7:{
                    System.out.println(" sap xep cac san pham theo thu tu giam dan: ");
                    productController.sortProductDESC();
                    break;
                }
            }
        }while (choice != 0);

    }

    private static Product InputProduct() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap id :");
        int  id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap name:");
        String name=scanner.nextLine();
        System.out.println("nhap gia san pham");
        int price=scanner.nextInt();
        Product product=new Product(id,name,price);
        return product;

    }

    private static void menu() {
        System.out.println("1.hien thi danh sach san pham");
        System.out.println("2.them moi san pham");
        System.out.println("3.sua san pham");
        System.out.println("4.xoa san pham theo id");
        System.out.println("5.tim kiem san pham theo ten");
        System.out.println("6.sap xep gia san pham theo thu tu tang dan");
        System.out.println("7.sap xep san pham theo thu tu giam dan");
        System.out.println("0.thoat chuong trinh ");
        System.out.println("chon chuc nang: ");

    }

}
