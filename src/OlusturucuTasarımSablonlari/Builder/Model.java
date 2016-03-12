package OlusturucuTasarımSablonlari.Builder;

/**
 * Created by cem on 12.03.2016.
 */
public class Model {
    private String model;

    public Model(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return model;
    }
}
