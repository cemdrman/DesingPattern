package OlusturucuTasarımSablonlari.AbstractFactory;

/**
 * Created by cem on 01.03.2016.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new ConCreateFactoryImpl();
        Elma elma = factory.getElma();
        Biber biber = factory.getBiber();
        System.out.println(elma.getType());
        System.out.println(biber.getType());
    }
}
