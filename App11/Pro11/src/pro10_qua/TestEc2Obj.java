package pro10_qua;

public class TestEc2Obj {
    public static void main(String[] args) {
        Ec2Obj x = new Ec2Obj(1., 2., 1.);
        System.out.println(x);
        x.setC(100.);
        x.setA(12.);
        System.out.println(x);
        
        Ec2Obj x1 = new Ec2Obj(1., 2., 100.);
        System.out.println(x1);
        Ec2Obj x2 = new Ec2Obj(0., 0., 100.);
        System.out.println(x2);


        Ec2Obj a[] = new Ec2Obj[30];
        for (int i = 0; i < a.length; ++i) {
            a[i] = new Ec2Obj(Math.sin(i), i * Math.random(), i);
            System.out.printf("\n%d) %s\n", i + 1, a[i]);
            if (a[i].isReal()) {
                System.out.println(a[i].getX1()+a[i].getX2());
            } else {
                System.out.println(a[i].getRe()+a[i].getRe());
            }
        }
    }
}
