package Java.dataStructure.linertable;

import java.util.Arrays;

/**
 * 顺序表
 * 底层采用数组，长度可以动态变化
 * java.utils.ArrayList 每次增长50%
 */
public class ArrayList implements List {
    private Object[] elementData; //底层是一个数组，目前还没有确定长度
    private int size; //不是数组分配了几个空间，而是数组中元素的个数
    public ArrayList() {
        //没有指定长度，默认长度是4
        this(4);
        //没有指定长度，长度是0
//        elementData = new Object[]{};
    }

    /**
     * 指定数组初始长度
     *
     * @param initalCapacity
     */
    public ArrayList(int initalCapacity) {
        //给数组分配指定数量的空间
        elementData = new Object[initalCapacity];
        //指定顺序表的元素个数，默认是0
//        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i >= size) {//i < 0 或者 i >= size
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++) {
            if(e.equals(elementData[i]))
                return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if(e.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    @Override
    public void add(int i, Object e) {
        //i 的位置要正确
        if (i<0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        //数组元素个数等于数组长度时，需要扩容
        if(size == elementData.length){
            //扩容方法
            grow();
        }
        //后移i 及其后面的元素，从最后一个元素开始
        for (int j = size; j > i ; j--) {
            elementData[j] = elementData[j-1];
        }
        //给数组第i 个位置赋值
        elementData[i] = e;
        //数组元素个数+1
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size, e);

//        if(size == elementData.length){
//            grow();
//        }
//        //给数组赋值
//        elementData[size] = e;
//        //元素个数+1
//        size++;
////        elementData[size++] = e;
////        System.out.println("length = "+elementData.length);
    }


//    private void grow(){
//        //创建一个新数组，长度是旧数组2倍
//        Object[] newArr = new Object[elementData.length * 2];
//        //将旧数组数据拷贝到新数组
//        for (int i = 0; i < size; i++) {
//            newArr[i] = elementData[i];
//        }
//        //让旧数组 指向 新数组
//        elementData = newArr;


    private void grow(){
        //扩容 拷贝 赋值
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }


    @Override
    public boolean addBefore(Object obj, Object e) {
        int indexOf = indexOf(obj);
        if(indexOf == -1) return false;
        add(indexOf,e);
        return true;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        int indexOf = indexOf(obj);
        if(indexOf == -1) return false;
        add(indexOf+1,e);
        return true;
    }

    @Override
    public Object remove(int i) {
        if (i < 0 || i >= size) {
            throw new MyArrayIndexOutOfBoundsException("数组越界异常："+ i);
        }
        Object empt = elementData[i];
        for (int j = i; j < size; j++) {
            elementData[j] = elementData[j+1];
        }
        elementData[size-1] = null;
        size--;
        return empt;
    }

    @Override
    public boolean remove(Object e) {
        int indexOf = indexOf(e);
        if(indexOf == -1) return false;
        remove(indexOf);
        return true;
    }

    @Override
    public Object replace(int i, Object e) {
        if (i < 0 || i >= size) {//i < 0 或者 i >= size
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }
        Object temp = elementData[i];
        elementData[i] = e;
        return temp;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1){
                builder.append(elementData[i]+",");
            }else {
                builder.append(elementData[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
