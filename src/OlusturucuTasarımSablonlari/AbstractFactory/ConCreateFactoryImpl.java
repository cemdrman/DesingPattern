package OlusturucuTasarımSablonlari.AbstractFactory;

/**
 * Created by cem on 01.03.2016.
 */
public class ConCreateFactoryImpl implements AbstractFactory {
    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
}
