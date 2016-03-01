package OlusturucuTasarımSablonlari.FactoryTS;

/**
 * Created by cem on 01.03.2016.
 */
public class Bmw extends ArabaFabrika {
    public void createAuto(){
        getArabaListesi().add(new Z4(170));
    }
}
