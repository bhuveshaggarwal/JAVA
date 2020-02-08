public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int KiloBytes){

        if (KiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int inMegaBytes = KiloBytes / 1024 ;
            int remainingKiloBytes = KiloBytes % 1024 ;
            String result = KiloBytes + " KB " + " = " + inMegaBytes + " MB " + " and " + remainingKiloBytes + " KB " ;
            System.out.println(result);
        }
    }

}
