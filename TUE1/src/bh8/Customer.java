package bh8;

public class Customer implements IListener {
    private final String name;
    private double money;
    private int id;

    public Customer(int ma, String ten, double tien) {
        this.name = ten;
        this.id = ma;
        this.money = tien;
    }

    @Override
    public void subscribe(IGenerator r) {
        r.add(this);
    }

    @Override
    public void response(IGenerator rap, EventArg p) {
        if (((Film) p).getTen().toLowerCase().contains("adam") && ((Galaxy) rap).getDiaChi().toLowerCase().contains("hcm")
                && this.money > 100000.0)
            System.out.println(this.name + " di xem");
    }

    @Override
    public boolean equal(IListener listener) {
        return this.getId() == listener.getId();
    }

    @Override
    public Object getId() {
        return this.id;
    }
}
