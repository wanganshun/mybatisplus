package cn.was.test;

/**
 * @program: mybatisplus01
 * @author: WangAnShun
 * @create: 2022-12-11 23:35
 **/
public class Tree extends AbstractTree {
    private Node root;

    @Override
    public Node find(int key) {
        Node current=root;
        while (current!=null){
            if (current.data>key){
                current=current.leftNode;

            }else if (current.data<key){
                current=current.rightNode;

            }else {
                return current;

            }
        }
        return null;
    }

    @Override
    public boolean insert(int data) {
        count++;
        Node newNode = new Node(data);
        if (root==null){
            root=newNode;
            return true;

        }
        Node current=root;
        Node parentNode=null;
        while (current!=null){
            parentNode=current;
            if (current.data>data){
                current=current.leftNode;
                if (current==null){
                    parentNode.leftNode=newNode;
                    return true;
                }
            }
            else {
                current=current.rightNode;
                if (current==null){
                    parentNode.rightNode=newNode;
                    return true;

                }
            }
        }
        return false;
    }
}
