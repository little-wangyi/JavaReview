package Collection_.List_;


import java.util.ArrayList;

public class sourceCode_Analyze {
    public static void main(String[] args) {
        //无参构造器，创建一个空的elementData
        //this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            //public boolean add(E e) {
            //        ensureCapacityInternal(size + 1);  // Increments modCount!!
            //        elementData[size++] = e;
            //        return true;
            //    }
            //ensureCapacityInternal确认大小是否需要扩容
            //private void grow(int minCapacity) {
            //        // overflow-conscious code
            //        int oldCapacity = elementData.length;
            //        int newCapacity = oldCapacity + (oldCapacity >> 1);  //每次扩容1.5倍数
            //        if (newCapacity - minCapacity < 0)
            //            newCapacity = minCapacity;
            //        if (newCapacity - MAX_ARRAY_SIZE > 0)
            //            newCapacity = hugeCapacity(minCapacity);
            //        // minCapacity is usually close to size, so this is a win:
            //        elementData = Arrays.copyOf(elementData, newCapacity);
            //    }
            //
            list.add(i);
        }
    }
}