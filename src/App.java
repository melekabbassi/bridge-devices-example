public class App {
    public static void main(String[] args) throws Exception {
        Radio radio = new Radio(false, 0, 0);
        TV tv = new TV(false, 0, 0);
        Remote remote = new Remote(radio);

        radio.getStatus();
        tv.getStatus();

        System.out.println("Turning on radio");
        remote.device = radio;
        radio.enable();
        radio.getStatus();

        System.out.println("Increasing radio volume");
        for (int i = 0; i < 50; i++) {
            remote.volumeUp();
        }
        radio.getStatus();

        System.out.println("Decreasing radio volume");
        for (int i = 0; i < 20; i++) {
            remote.volumeDown();
        }
        radio.getStatus();
        tv.getStatus();

        System.out.println("Changing radio channel");
        for (int i = 0; i < 10; i++) {
            remote.channelUp();
        }
        radio.getStatus();

        System.out.println("Changing radio channel");
        for (int i = 0; i < 3; i++) {
            remote.channelDown();
        }
        radio.getStatus();


        System.out.println("*********************************************************************************");

        System.out.println("Turning on TV");
        remote.device = tv;
        tv.enable();
        tv.getStatus();

        System.out.println("Increasing TV volume");
        for (int i = 0; i < 50; i++) {
            remote.volumeUp();
        }
        tv.getStatus();

        System.out.println("Decreasing TV volume");
        for (int i = 0; i < 20; i++) {
            remote.volumeDown();
        }
        tv.getStatus();

        System.out.println("Changing TV channel");
        for (int i = 0; i < 10; i++) {
            remote.channelUp();
        }
        tv.getStatus();

        System.out.println("Changing TV channel");
        for (int i = 0; i < 3; i++) {
            remote.channelDown();
        }
        tv.getStatus();

        System.out.println("Turning off TV");
        tv.disable();
        tv.getStatus();

        System.out.println("Turning off radio");
        radio.disable();
        radio.getStatus();

    }
}
