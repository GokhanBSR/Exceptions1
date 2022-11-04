//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Kobay {
    public Kobay() {
    }

    public static void cikart(int a, int b) throws BenimHatam, SeninHatan {
        if (a == 0) {
            throw new SeninHatan("a parametresi sifir geldi");
        } else if (b == 0) {
            throw new SeninHatan("b parametresi sifir geldi");
        } else if (a >= 0 && b >= 0) {
            int sonuc = a - b;
            if (sonuc < 0) {
                throw new BenimHatam("sonuc eksi", 2);
            } else if (sonuc == 0) {
                throw new BenimHatam("sonuc sifir", 1);
            }
        } else {
            throw new SeninHatan();
        }
    }

    public static void main(String[] args) throws BenimHatam, SeninHatan {
        cikart(10, 10);
    }
}
