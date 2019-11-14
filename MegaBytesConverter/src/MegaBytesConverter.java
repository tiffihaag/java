public class MegaBytesConverter {
    public static int printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        else {
            int megaBytes = Math.round(kiloBytes / 1024);
            int remainderofKiloBytes = (megaBytes % kiloBytes);
            System.out.println(kiloBytes +" KB = " + megaBytes + " MB" + " and " + remainderofKiloBytes + " KB");
            return megaBytes;
        }
    }
}
