package club.banyuan.may18;

public class StringMeasurer<Objcet> implements Measurer<Object>{
    @Override
    public double measure(Object anObject) {
        if (anObject == null) {
            return 0;
        }
        if (anObject instanceof String) {
            String string = (String) anObject;
            return string.length();
        }
        throw new IllegalArgumentException("不是字符串类");
    }
}
