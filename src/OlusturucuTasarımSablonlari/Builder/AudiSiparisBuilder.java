package OlusturucuTasarımSablonlari.Builder;

/**
 * Created by cem on 12.03.2016.
 */
public class AudiSiparisBuilder extends SiparisBuilder {
    public AudiSiparisBuilder(){

    }
    @Override
    public void setMarka(String marka) {
        getAraba().setMarka(new Marka(marka));
    }

    @Override
    public void setModel(String model) {
        getAraba().setModel(new Model(model));
    }

    @Override
    public void setRenk(String renk) {
        getAraba().setRenk(renk);
    }

    @Override
    public void setBeygirGucu(int bg) {
        getAraba().setBeygirGucu(bg);
    }
}
