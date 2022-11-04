//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class FinallyOrnek1 {
    public FinallyOrnek1() {
    }

    public static void a(int deger) throws SeninHatan {
        if (deger < 0) {
            throw new SeninHatan();
        }
    }

    public void hesapla() {
        for(int i = -1; i < 1; ++i) {
            try {
                System.out.println("a() cagriliyor");
                a(i);
            } catch (SeninHatan var6) {
                System.out.println("SeninHatan olustu : " + var6);
            } finally {
                System.out.println("finally blogu calistirildi");
            }
        }

    }
}
