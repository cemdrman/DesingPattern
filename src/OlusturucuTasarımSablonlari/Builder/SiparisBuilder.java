package OlusturucuTasarımSablonlari.Builder;

/**
 * Created by cem on 12.03.2016.
 */
public abstract class SiparisBuilder {
    private Araba araba = null;
    public SiparisBuilder(){

    }

    public Araba getAraba() {
        return araba;
    }

    public abstract void setMarka(String marka);
    public abstract void setModel(String model);
    public abstract void setRenk(String renk);
    public abstract void setBeygirGucu(int bg);

}
