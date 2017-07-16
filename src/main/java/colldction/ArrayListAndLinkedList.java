package colldction;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    /*
    线性表从存储结构上分为：顺序存储结构（数组）和 链式存储结构（链表）
    顺序存储结构：是用一段连续的内存空间存储表中的数据 L=(a1,a2,a3....an)
    链式存储结构：是用一段一段连续的内存空间存储表中每一行的数据，段与段之间通过一个引用（指针）相互连接来，
                  形成一个链式的存储结构

    Arraylist：
优点：ArrayList是实现了基于动态数组的数据结构,因为地址连续，一旦数据存储好了，查询操作效率会比较高（在内存里是连着放的）。
缺点：因为地址连续， ArrayList要移动数据,所以插入和删除操作效率比较低。

    LinkedList：
优点：LinkedList基于链表的数据结构,地址是任意的，所以在开辟内存空间的时候不需要等一个连续的地址，对于新增和删除操作add和remove，LinedList比较占优势。LinkedList 适用于要头尾操作或插入指定位置的场景
缺点：因为LinkedList要移动指针,所以查询操作性能比较低。

    适用场景分析：
 当需要对数据进行对此访问的情况下选用ArrayList，当需要对数据进行多次增加删除修改时采用LinkedList。
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add("aaa");
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println("arrayList添加用时：" + (timeEnd1 - timeStart1));

//        long timeStart2 = System.currentTimeMillis();
//        arrayList.get(50000);
//        long timeEnd2 = System.currentTimeMillis();
//        System.out.println("arrayList查找id50000用时：" + (timeEnd2 - timeStart2));
//        long timeStart3 = System.currentTimeMillis();
//        arrayList.get(500000);
//        long timeEnd3 = System.currentTimeMillis();
//        System.out.println("arrayList查找id500000用时：" + (timeEnd3 - timeStart3));
//        long timeStart4 = System.currentTimeMillis();
//        arrayList.get(950000);
//        long timeEnd4 = System.currentTimeMillis();
//        System.out.println("arrayList查找id950000用时：" + (timeEnd4 - timeStart4));
//
//        long timeStart5 = System.currentTimeMillis();
//        arrayList.set(50000, "bbb");
//        long timeEnd5 = System.currentTimeMillis();
//        System.out.println("arrayList修改id50000用时：" + (timeEnd5 - timeStart5));
//        long timeStart6 = System.currentTimeMillis();
//        arrayList.add(500000,"www");
//        long timeEnd6 = System.currentTimeMillis();
//        System.out.println("arrayList删除id500000用时：" + (timeEnd6 - timeStart6));
//        long timeStart7 = System.currentTimeMillis();
//        arrayList.set(950000, "bbb");
//        long timeEnd7 = System.currentTimeMillis();
//        System.out.println("arrayList修改id950000用时：" + (timeEnd7 - timeStart7));
//
//
        LinkedList<String> linkedList = new LinkedList<>();
        long timeStart11 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add("ewr");
        }
        long timeEnd11 = System.currentTimeMillis();
        System.out.println("linkedList添加用时：" + (timeEnd11 - timeStart11));
//
//        long timeStart21 = System.currentTimeMillis();
//        linkedList.get(50000);
//        long timeEnd21 = System.currentTimeMillis();
//        System.out.println("linkedList查找id50000用时：" + (timeEnd21 - timeStart21));
//        long timeStart22 = System.currentTimeMillis();
//        linkedList.get(500000);
//        long timeEnd22 = System.currentTimeMillis();
//        System.out.println("linkedList查找id500000用时：" + (timeEnd22 - timeStart22));
//        long timeStart23 = System.currentTimeMillis();
//        linkedList.get(950000);
//        long timeEnd23 = System.currentTimeMillis();
//        System.out.println("linkedList查找id950000用时：" + (timeEnd23 - timeStart23));
//
//
//
//        long timeStart12 = System.currentTimeMillis();
//        linkedList.set(50000, "bbb");
//        long timeEnd12 = System.currentTimeMillis();
//        System.out.println("linkedList修改id50000用时：" + (timeEnd12 - timeStart12));
//        long timeStart13 = System.currentTimeMillis();
//        linkedList.set(500000, "bbb");
//        long timeEnd13 = System.currentTimeMillis();
//        System.out.println("linkedList修改id500000用时：" + (timeEnd13 - timeStart13));
//        long timeStart14 = System.currentTimeMillis();
//        linkedList.set(950000, "bbb");
//        long timeEnd14 = System.currentTimeMillis();
//        System.out.println("linkedList修改id950000用时：" + (timeEnd14 - timeStart14));

    }
}
