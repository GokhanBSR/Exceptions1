/**
 * @author hcalpay
 * @Date 30.10.2022
 */
public class SeninHatan extends Exception{

    //    private int id;
    SeninHatan(){

    }
    SeninHatan(String aciklama){
        super(aciklama);
    }
//    SeninHatan(String aciklama, int id){
//        super(aciklama);
////        this.id = id;
//    }

//    // ATA SINIFTAN GELEN METODU BEGENMEYİP DEĞİŞTİRMEK İSTİYORUZ.
//    @Override
//    public String getLocalizedMessage() {
//        return switch (id) {
//            case 1 -> "önemsiz";
//            case 2 -> "az önemli hata ";
//            case 3 -> "çok önemli hata";
//            default -> "tanımsız hata";
//        };
//    }
//
//    public int getId() {
//        return id;
//    }
}
