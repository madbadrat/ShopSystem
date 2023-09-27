import java.util.HashSet;

public class Shop {
    private String address;
    private double money;
    private HashSet<Product> assortment = new HashSet<Product>();
    // TODO: как сделать коллекцию из сотрудников

    public Shop(String address) {

    }

    public Shop(String address, double money) {

    }

    /**
     * Нанять сотрудника <br>
     * В зависимости от post вызвать создать экземпляр Seller, ProductExpers или Storekeeper
     * Добавить нового сотрудника в коллекцию сотрудников этого магазина
     */
    public void hireWorker(String name, String phoneNumber, String post) {

    }

    /**
     * Заплатить налог <br>
     * Уменьшает количество денег в магазине на сумму tax
     */
    public void payTax(double tax) {

    }
}
