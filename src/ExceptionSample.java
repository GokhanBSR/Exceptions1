//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ExceptionSample {
    public ExceptionSample() {
    }

    void exceptionOrnek() {
        int[] sayilar = new int[10];

        try {
            for(int i = 0; i < 10; ++i) {
                sayilar[i] = (int)(Math.random() * 10.0);
                if (i == 2) {
                    System.out.println(sayilar[i] / 0);
                }

                if (i == 1) {
                    System.out.println(sayilar[10]);
                }
            }
        } catch (ArithmeticException var3) {
            System.out.println("BURADA HATAYA DÜŞTÜN ,SEBEBİDE : 0 a bölünme hatası");
        } catch (ArrayIndexOutOfBoundsException var4) {
            System.out.println("BURADA HATAYA DÜŞTÜN ,SEBEBİDE : dizinin olmayan elemanına erişim");
        }

    }

    void exceptionFirlatma() {
    }

    void exceptionYakalama() {
    }
}
