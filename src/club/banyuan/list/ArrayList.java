package club.banyuan.list;

public class ArrayList implements List {
    private Object[] arrayList = new Object[10];
    private int size;
    @Override
    public Object set(int index, Object element) {
        if (arrayList.length <= index) {
            System.out.println("索引越界");
            return null;
        }
        Object object = get(index);
        arrayList[index] = element;
        return object;
    }

    @Override
    public Object get(int index) {
        if (index > arrayList.length){
            System.out.println("索引越界");
            return null;
        }
        return arrayList[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrayList.length ; i++) {
            arrayList[i] = null;
        }
    }

    @Override
    public Object remove(int index) {
        if (index >= arrayList.length) {
            return null;
        }
        return arrayList[index];
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        if (arrayList[arrayList.length - 1] != null) {
            increaseArrayListLength();
        }
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null) {
                arrayList[i] = o;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void increaseArrayListLength() {
        Object[] objects = new Object[arrayList.length + 10];
        for (int i = 0; i < arrayList.length; i++) {
            objects[i] = arrayList[i];
        }
        arrayList = objects;
    }
}
