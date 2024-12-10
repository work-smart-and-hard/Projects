import java.util.List;
import java.util.ArrayList;

class Product {
    private String product_name;
    private int product_weight;
    
    public Product(String product_name, int product_weight) {
        this.product_name = product_name;
        this.product_weight = product_weight;
    }
    
    public String getProductName() {
        return product_name;
    }
    
    public int getProductWeight() {
        return product_weight;
    }
    
    @Override
    public String toString() {
        return product_name + " (" + product_weight + " кг)";
    }
}

class Warehouse {
    private List<Product> product_warehouse;

    public Warehouse(List<Product> product_warehouse) {
        this.product_warehouse = new ArrayList<>(product_warehouse);
    }

    public synchronized Product takeProduct() {
        if (product_warehouse.isEmpty()) return null;
        return product_warehouse.remove(0);
    }

    public boolean hasProducts() {
        return !product_warehouse.isEmpty();
    }
}

class Loader extends Thread {
    private int loader_id;
    private int loader_can_lift = 150;
    private int current_total_weight = 0;
    private Warehouse warehouse;
    private List<Product> current_load = new ArrayList<>();

    public Loader(int loader_id, Warehouse warehouse) {
        this.loader_id = loader_id;
        this.warehouse = warehouse;
    }

    public void run() {
        while (warehouse.hasProducts()) {
            Product current_product = warehouse.takeProduct();
            synchronized (warehouse) {
                if (!warehouse.hasProducts()) break;
            }    
            if (current_product == null) continue;
            if (current_total_weight + current_product.getProductWeight() >= loader_can_lift) {
                unload();
            }
            if (current_total_weight + current_product.getProductWeight() <= loader_can_lift) {
                current_load.add(current_product);
                current_total_weight += current_product.getProductWeight();
                System.out.println("Грузчик " + loader_id + " загрузил " + current_product + " для текущей погрузки.");
                System.out.println("Общий вес текущей погрузки для грузчика " + loader_id + " равен " + current_total_weight + " кг.");
            }
            if (current_total_weight == loader_can_lift) {
                unload();
            }
        }
        if (current_total_weight > 0) {
            unload();
        }
    }

    public void unload() {
        System.out.println("Грузчик " + loader_id + " разгружает текущую погрузку " + current_load + ".");
        current_total_weight = 0;
        current_load.clear();
    }
}

public class ThirdExercise {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Гантели", 50));
        products.add(new Product("Блины со сгущенкой", 60));
        products.add(new Product("Говядина", 40));
        products.add(new Product("Индейка", 70));
        products.add(new Product("Рыба", 30));
        products.add(new Product("Гречка", 20));
        products.add(new Product("Куриная грудка", 80));
        products.add(new Product("Молоко", 75));
        products.add(new Product("Морепродукты", 52));
        products.add(new Product("Гриф", 20));
        products.add(new Product("Вода", 3));
        products.add(new Product("Рис", 85));
        products.add(new Product("Растишка", 38));
        products.add(new Product("Творог", 24));
        products.add(new Product("Рама для приседа", 125));
        Warehouse warehouse = new Warehouse(products);
        Loader loader_1 = new Loader(1, warehouse);
        Loader loader_2 = new Loader(2, warehouse);
        Loader loader_3 = new Loader(3, warehouse);
        loader_1.start();
        loader_2.start();
        loader_3.start();
        try {
            loader_1.join();
            loader_2.join();
            loader_3.join();
        } catch (InterruptedException e) {
            System.err.println("Ошибка: " + e);
        }
        System.out.println("Погрузка товаров окончена");
    }
}