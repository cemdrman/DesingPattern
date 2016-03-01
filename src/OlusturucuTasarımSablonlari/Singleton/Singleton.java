package OlusturucuTasarımSablonlari.Singleton;

/**
 * Created by cem on 02.03.2016.
 */
public class Singleton {
    //bu sınıftan oluşturulabilecek tek nesne static olarak tanımlanır.
    private static Singleton instance = null;

    //double check locking yapabilmek için kullanılan nesne.
    private static Object lock = new Object();


    //başka sınıfların new Singleton() şeklinde nesne oluşturmalarını
    // konstruktorünü private yaparak engellemiş oluruz
    private Singleton(){
        System.out.println("singleton init()");
    }

    public static Singleton instance(){
        if (instance == null) {

            synchronized (lock){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printThis(){
        System.out.println(this);
    }
}
