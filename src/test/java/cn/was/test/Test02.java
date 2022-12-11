package cn.was.test;

/**
 * @program: mybatisplus01
 * @author: WangAnShun
 * @create: 2022-12-11 23:47
 **/
public class Test02 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(80);
        t.insert(70);
        t.insert(100);
        t.insert(90);
        Node node=t.find(100);
        System.out.println(node.leftNode.data);

        System.out.println(t.count);
    }
}
