package club.banyuan.may18;

public interface Measurer<Object> {
    /**
     * 计算对象的数量.
     */
    double measure(Object anObject);
}
