package Kris.start.Money.step;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> box = new ArrayList<>();

    public float getWeight() {
        float x = 0.0f;
        for (T f : box) {
            x += f.getWeight();
        }
        return x;
    }

    public boolean compare(Box<?> y) {
        return Math.abs(this.getWeight() - y.getWeight()) < 0.00001;
    }

    public void exchange(Box<? super T> x) {
        if (x != this) {
            x.box.addAll(this.box);
            this.box.clear();
        } else return;
    }

    public void addfruit(T x) {
        box.add(x);
    }
}
