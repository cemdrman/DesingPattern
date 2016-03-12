package OlusturucuTasarımSablonlari.Builder;

/**
 * Created by cem on 12.03.2016.
 */
public class Marka {
    private String marka;
    public Marka(String marka){
       setMarka(marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String toString(){
        return marka;
    }
}
