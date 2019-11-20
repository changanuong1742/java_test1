package com.codegym.view;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            ProductView.menu();
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    List<Product> productList = productController.getProducts();
                    for (Product p : productList) {
                        System.out.println("ID:" + p.getId() + " NAME:" + p.getName() + " Price: " + p.getPrice() + " Trieu");
                    }
                    break;
                }
                case 2: {
                    Product product = ProductView.productForm();
                    productController.addProduct(product);
                    break;
                }

                case 3: {
                    System.out.println("NHap ID san pham muon thay doi");
                    int id = input.nextInt();
                    if (productController.check(id) == true) {
                        Product product = ProductView.productFormEdit();
                        productController.editProduct(id, product);
                        break;
                    }
                }

                case 4: {
                    System.out.println("Nhap ID muon xoa");
                    int id = input.nextInt();
                    if (productController.check(id) == true) {
                        productController.deleteProduct(id);
                    }
                }

                case 5: {
                    System.out.println("Nhap Name MUon Tim");
                    String newname = new Scanner(System.in).nextLine();

                    if (productController.check((String) newname) == true) {
                        productController.findByName(newname);

                    } else {
                        System.out.println("Khong co san pham trong danh sach !!!");
                    }

                    break;
                }

                case 6: {
                    productController.sortPrice();
                    break;
                }
                case 0: {
                    System.out.println("Thoat.");
                    break;
                }
            }
        } while (choice != 0);

    }

    public static void menu() {
        System.out.println("-------------------------------------------");
        System.out.println("Quan ly san pham");
        System.out.println("1. Hien thi danh sach san pham");
        System.out.println("2. Them moi san pham");
        System.out.println("3. Sua thong tin san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Tim san pham theo ten");
        System.out.println("6. Sap xep san pham theo gia");
        System.out.println("Nhap vao lua chon:");
    }

    public static Product productForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap Gia:");
        int price = scanner.nextInt();

        Product product = new Product(id, name, price);
        return product;

    }


    public static Product productFormEdit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id moi:");
        int newid = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name moi :");
        String newname = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap Gia moi :");
        int newprice = scanner.nextInt();

        Product newproduct = new Product(newid, newname, newprice);
        return newproduct;
    }


}