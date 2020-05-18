package club.banyuan.queue;

public class ArrayQueue implements Queue {

    private static final int ARRAY_LENGTH = 10;
    private Object[] arrays = new Object[ARRAY_LENGTH];
    int size;

    @Override
    public boolean add(Object object) {
        if (object == null) {
            return false;
        } else if (arrays[arrays.length - 1] != null) {
            increaseArrayLength();
            //判断数组是否存满，存满则扩容
        }
        for (int i = 0; i < arrays.length; i++) {
            //遍历数组，找到第一个null的位置并赋值为object
            if (arrays[i] == null) {
                arrays[i] = object;
                size++;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove() {
        // 如果数组为空，则没法删除
        if (size == 0) {
            return false;
        } else {
            //从第一个添加开始删除
            for (int i = 0; i < size - 1; i++){
                arrays[i] = arrays[i + 1];
            }
            arrays[size - 1] = null;
            size--;
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void increaseArrayLength() {
        //数组扩容，每次扩大两倍
        Object[] objects = new Object[ARRAY_LENGTH * 2];
        //将扩容后的数组赋值
        System.arraycopy(arrays, 0, objects, 0, arrays.length - 1);
        arrays = objects;
    }
}
