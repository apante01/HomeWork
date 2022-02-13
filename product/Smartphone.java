package product;

import category.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Smartphone extends Product {
    private Phone phone;
    Map<String,Integer> smartphoneMap = new HashMap<>();


    public Smartphone(String nameProduct, String brand, int price, String description) {
        super(nameProduct, brand, price, description);

    }

    public Smartphone() {

        List<Smartphone> smartphoneList = new ArrayList<>();



    Smartphone samsung = new Smartphone("Телефон", "Samsung", 14999,
                                        "Модель-Galaxy, 16ГБ");

    Smartphone dexp440 = new Smartphone("Телефон", "DEXP440", 3199,
            "Модель- A440, 8ГБ, розовый");
    Smartphone dexpG450 = new Smartphone("Телефон", "DEXP", 3199,
            "Модель- G450, 8ГБ, серый");
    Smartphone bq = new Smartphone("Телефон", "BQ", 3999,
            "Модель- 4030G, 16ГБ, черный, камера 2Мп");
    Smartphone itelA17 = new Smartphone("Телефон", "Itel", 4199,
            "Модель- A17, 16ГБ, голубой, камера 5Мп");
        smartphoneList.add(samsung);
        smartphoneList.add(dexp440);
        smartphoneList.add(dexpG450);
        smartphoneList.add(bq);
        smartphoneList.add(itelA17);
getSmartphoneList(smartphoneList);
addMap(smartphoneList);
        System.out.println(smartphoneMap);

    }

    public  void getSmartphoneList(List<Smartphone> smartphoneList){
        for (Smartphone test: smartphoneList) {
            System.out.println(test);
        }
    }
    public Phone getPhone() {
        return phone;
    }
    public void addMap(List<Smartphone> smartphoneList){

        for (Smartphone test : smartphoneList)
            smartphoneMap.put(test.getBrand(), test.getPrice());






    }
}
