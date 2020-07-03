import java.math.BigDecimal;
import java.util.Scanner;

class Computer{
    String brand;
}

public class Learn {
    // field
    int id;
    String sname;
    int age;
    Computer comp;
    private void study(String brand) {
        System.out.println("我正在学习！使用我们的电脑，" + brand);
    }
    private Learn() {
    }
    public static void main(String[] args) {
        Learn stu1 = new Learn();
        stu1.sname = "张三";
        stu1.id = 12;
        Computer comp1 = new Computer();
        comp1.brand = "联想";
        stu1.comp = comp1;
        stu1.study("apple");
    }
}
