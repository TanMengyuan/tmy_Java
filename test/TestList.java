import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void test01() {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty()); // true,容器里面没有元素
        list.add("aaa");
        System.out.println(list.isEmpty()); // false,容器里面有元素
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        System.out.println("list的大小：" + list.size());
        System.out.println("是否包含指定元素：" + list.contains("aaa"));
        list.remove("bbb");
        System.out.println(list);
        Object[] objs = list.toArray();
        System.out.println("转化成Object数组：" + Arrays.toString(objs));
        list.clear();
        System.out.println("清空所有元素：" + list);
    }
    public static void main(String[] args) {
        test01();
    }
}
