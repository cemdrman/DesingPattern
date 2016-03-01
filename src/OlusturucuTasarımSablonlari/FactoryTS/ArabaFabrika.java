package OlusturucuTasarımSablonlari.FactoryTS;

import java.util.ArrayList;

/**
 * Created by cem on 01.03.2016.
 */
public abstract class ArabaFabrika{
    private ArrayList<Araba> arabaListesi = new ArrayList<>();
    public abstract void createAuto();

    public ArabaFabrika(){
        this.createAuto();
    }
    public ArrayList<Araba> getArabaListesi() {
        return arabaListesi;
    }

    public void setArabaListesi(ArrayList<Araba> arabaListesi) {
        this.arabaListesi = arabaListesi;
    }
}
