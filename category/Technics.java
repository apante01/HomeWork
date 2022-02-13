package category;

import onlineStore.OnlineStore;
import product.Smartphone;

public class Technics extends Category{
    private Phone phone;
    private OnlineStore onlineStore;
    private Smartphone smartphone;


    public Technics(String nameCategory,OnlineStore onlineStore) {
        super(nameCategory);
        this.onlineStore = onlineStore;
        phone = new Phone("Телефоны",getSmartphone());

    }

    public Phone getPhone() {
        return phone;
    }

    public OnlineStore getOnlineStore() {
        return onlineStore;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }
}
