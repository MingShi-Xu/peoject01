package club.banyuan.pair;


import club.banyuan.practice02.Measurable;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> pair){
        Pair<T> p = new Pair<>(pair.getFirst(),pair.getSecond());
        p.swap();
        return p;
    }
    public static <T> Pair<T> minMax(Measurable[] measurables){
        for (int i = 0; i < measurables.length; i++) {

        }
        return new Pair(111,222);
    }
}
