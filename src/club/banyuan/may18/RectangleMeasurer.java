package club.banyuan.may18;


public class RectangleMeasurer<Objcet> implements Measurer<Objcet> {

    @Override
    public double measure(Object anObject) {
        if (anObject instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) anObject;
            return rectangle.width * rectangle.height;
        }
        throw new IllegalArgumentException("不是矩形类");
    }
}
