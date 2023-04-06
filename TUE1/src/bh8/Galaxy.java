package bh8;


import java.util.ArrayList;
import java.util.List;

public class Galaxy implements IGenerator {
    private final String ten;
    private final String diaChi;
    static private List<IListener> cuonSo = null;

    public Galaxy(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.cuonSo = new ArrayList<IListener>();
    }

    @Override
    public void onEvent(Object obj, EventArg p) {
        for (var k : this.cuonSo)
            k.response(this, p);
    }

    @Override
    public void add(IListener k) {
        synchronized (this.cuonSo) {
            if (!this.find(k))
                this.cuonSo.add(k);
        }
    }

    @Override
    public boolean find(IListener listener) {
        for (IListener l : this.cuonSo)
            if (l.equals(listener)) return true;
        return false;
    }

    public String getDiaChi() {
        return this.diaChi;
    }
}
