package OlusturucuTasarımSablonlari.Prototype;

/**
 * Created by cem on 12.03.2016.
 */
public class FirmaAdres extends AdresPrototype {
    private String firma;

    public FirmaAdres(String sokak,String no,String semt,String sehir,String firma){
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        setFirma(firma);
    }
    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }
}
