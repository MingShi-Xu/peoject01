package club.banyuan.queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.add(1));
        System.out.println(aq.add(2));
        System.out.println(aq.add(3));
        System.out.println(aq.size);
        System.out.println(!aq.isEmpty());
        System.out.println(aq.remove());
        System.out.println(aq.remove());
        System.out.println(aq.remove());
        System.out.println(aq.add(1));
        System.out.println(aq.remove());
    }
}
