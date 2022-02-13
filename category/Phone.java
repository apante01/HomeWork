package category;

import product.Product;
import product.Smartphone;

import java.util.ArrayList;
import java.util.List;


public class Phone extends Category {
    private Smartphone smartphone;

    public Phone(String nameCategory,Smartphone smartphone) {
        super(nameCategory);
        this.smartphone = smartphone;
        //smartphone = new Smartphone();


    }


    public Smartphone getSmartphone() {
        return smartphone;
    }






}
