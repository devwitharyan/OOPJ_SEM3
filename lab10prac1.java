class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display(MyPoint m1) {
        double ans = Math.pow(m1.x - this.x, 2) + Math.pow(m1.y - this.y, 2);
        System.out.println(Math.sqrt(ans));
    }

    public void display(int x, int y) {
        double ans = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        System.out.println(Math.sqrt(ans));
    }
}

class lab10prac1 {
    public static void main(String[] args) {
        MyPoint MP1 = new MyPoint(1, 1);
        MyPoint MP2 = new MyPoint(6, 7);

        MP1.display(MP2);
        MP1.display(8, 9);
    }
}
