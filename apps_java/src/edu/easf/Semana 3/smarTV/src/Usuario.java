public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " +smartTv.estado);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);
        

        smartTv.power();
        smartTv.aumentarVolume();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        smartTv.mudarCanal(13);
        smartTv.descerCanal();
        smartTv.descerCanal();
        smartTv.power();

    }
}
