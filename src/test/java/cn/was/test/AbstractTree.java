package cn.was.test;

/**
 * @program: mybatisplus01
 * @author: WangAnShun
 * @create: 2022-12-11 23:33
 **/
public abstract class AbstractTree{
    public int count=0;
    public abstract Node find(int o);
    public abstract boolean insert(int o);
    public int count(){
        return this.count;

    }

}
