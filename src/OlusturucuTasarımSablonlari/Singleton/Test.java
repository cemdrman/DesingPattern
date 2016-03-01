package OlusturucuTasarımSablonlari.Singleton;

import OlusturucuTasarımSablonlari.AbstractFactory.DolmaBiber;

/**
 * Created by cem on 02.03.2016.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton.instance().printThis();
        }
    }
}
