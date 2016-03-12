package OlusturucuTasarımSablonlari.Prototype;

/**
 * Created by cem on 12.03.2016.
 */
public abstract class AdresPrototype implements Cloneable{
    private String sokak;
    private String no;
    private String semt;
    private String sehir;
    public Object clone() throws CloneNotSupportedException {
        return (Object)super.clone();
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSemt() {
        return semt;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
    public void printAdres(){
        System.out.println("Sokak: " + getSokak());
        System.out.println("No: " + getNo());
        System.out.println("Semt: " + getSemt());
        System.out.println("Şehir: " + getSehir());
        System.out.println("hashCode: " +this.hashCode());
    }
}
