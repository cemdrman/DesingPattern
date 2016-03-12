package OlusturucuTasarımSablonlari.Builder;

/**
 * Created by cem on 12.03.2016.
 */
public class SiparisManager {
    private SiparisBuilder builder;
    public Araba createOrder(String marka,String model,String renk,int bg){
        if (marka.equals("Ford")) {
            builder = new FordSiparisBuilder();
        }
        else if(marka.equals("Audi")){
            builder = new AudiSiparisBuilder();
        }
        builder.setMarka(marka);
        builder.setModel(model);
        builder.setRenk(renk);
        builder.setBeygirGucu(bg);
        return builder.getAraba();
    }
    public void printOrder(){
        System.out.println("Marka: " + builder.getAraba().getMarka());
        System.out.println("Model: " + builder.getAraba().getModel());
        System.out.println("Renk: " + builder.getAraba().getRenk());
        System.out.println("Beygirgücü: " + builder.getAraba().getBeygirGucu());
    }
}
