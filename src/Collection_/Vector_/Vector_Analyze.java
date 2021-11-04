package Collection_.Vector_;

import java.util.Vector;

public class Vector_Analyze {
    public static void main(String[] args) {
        //若无参，默认分配10个大小
        Vector vector = new Vector();
        for(int i = 0;i<10;i++){
            //ensureCapacityHelper判断是否需要扩容
            vector.add(i);
        }
        //private void grow(int minCapacity) {
        //        // overflow-conscious code
        //        int oldCapacity = elementData.length;
        //        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
        //                                         capacityIncrement : oldCapacity);
        //        if (newCapacity - minCapacity < 0)
        //            newCapacity = minCapacity;
        //        if (newCapacity - MAX_ARRAY_SIZE > 0)
        //            newCapacity = hugeCapacity(minCapacity);
        //        elementData = Arrays.copyOf(elementData, newCapacity);
        //    }
        //Vector的扩容是2倍的扩容
        for(int i = 11;i<15;i++){
            vector.add(i);
        }
    }
}
