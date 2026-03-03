public class OOPSBannerApp2 {
    public static void main(String[] args) {

        String line1 = "   *       *    * *      ***  ";
        String line2 = "  *  *    *  *  *   *   *     ";
        String line3 = "  *  *    *  *  *   *   *     ";
        String line4 = "  *  *    *  *  *   *   *     ";
        String line5 = "  *  *    *  *  **       ***  ";
        String line6 = "  *  *    *  *  *           * ";
        String line7 = "  *  *    *  *  *            *";
        String line8 = "  *  *    * *   *            *";
        String line9 = "   *       *    *        ***  ";

        String banner = line1 + "\n"
                      + line2 + "\n"
                      + line3 + "\n"
                      + line4 + "\n"
                      + line5 + "\n"
                      + line6 + "\n"
                      + line7 + "\n"
                      + line8 + "\n"
                      + line9;

        System.out.println(banner);
    }
}