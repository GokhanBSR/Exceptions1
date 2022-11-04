//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class BenimHatam extends Exception {
    private int id;

    BenimHatam() {
    }

    BenimHatam(String aciklama) {
        super(aciklama);
    }

    BenimHatam(String aciklama, int id) {
        super(aciklama);
        this.id = id;
    }

    public String getLocalizedMessage() {
        String var10000;
        switch (this.id) {
            case 1:
                var10000 = "önemsiz";
                break;
            case 2:
                var10000 = "az önemli hata ";
                break;
            case 3:
                var10000 = "çok önemli hata";
                break;
            default:
                var10000 = "tanımsız hata";
        }

        return var10000;
    }

    public int getId() {
        return this.id;
    }
}
