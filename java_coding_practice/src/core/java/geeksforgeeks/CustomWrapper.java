package core.java.geeksforgeeks;

class Maximum {
    private int max = 0;
    private int size = 0;

    public void insert(int x) {
        this.size++;
        if(x <= max) {
            return;
        }
        this.max = x;
    }

    public int max() {
        return this.max;
    }

    public int count() {
        return this.size;
    }
}
public class CustomWrapper {
    public static void main(String[] s) {
        Maximum m = new Maximum();
        m.insert(12);
        m.insert(3);
        m.insert(15);

        System.out.println(m.max());
        System.out.println(m.count());
    }
}
