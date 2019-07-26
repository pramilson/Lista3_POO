/**
 * Main - comentário novo no commit
 */
public class Main {

    public static void main(String[] args) {
        Televisao TV = new Televisao();
        System.out.println(TV.consultarCanal());
        System.out.println(TV.consultarVolume());
        TV.aumentarCanal();
        TV.aumentarVolume();
        TV.trocarCanal(45);
        System.out.println(TV.consultarCanal());
        System.out.println(TV.consultarVolume());
    }
}