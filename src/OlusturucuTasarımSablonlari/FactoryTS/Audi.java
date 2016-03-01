package OlusturucuTasarımSablonlari.FactoryTS;

/**
 * Created by cem on 01.03.2016.
 */
public class Audi extends ArabaFabrika {

    public void createAuto() {
        getArabaListesi().add(new A4(120));
        getArabaListesi().add(new R8(350));
    }
}
