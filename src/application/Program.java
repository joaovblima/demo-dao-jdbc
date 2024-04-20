package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department dep = new Department(1, "Books");
        Seller seller = new Seller(1, "Joao Lima", "joao@gmail.com", new Date(), 2500.0, dep);

        System.out.println(dep);
        System.out.println(seller);
    }
}
