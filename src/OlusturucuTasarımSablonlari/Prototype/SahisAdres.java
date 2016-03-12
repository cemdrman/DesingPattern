package OlusturucuTasarımSablonlari.Prototype;

/**
 * Created by cem on 12.03.2016.
 */
public class SahisAdres extends AdresPrototype {
    private String isim;
    private String soyad;

    public SahisAdres(String sokak,String no,String semt,String sehir,String isim,String soyad) {
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        setIsim(isim);
        setSoyad(soyad);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
