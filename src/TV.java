public class TV extends TVDevice {
    @Override
    public void powerOn() {
        System.out.println("Power ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Power OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("1+1");
    }

    @Override
    public void currentChannel() {
        System.out.println("Netflix");
    }

    @Override
    public void upVolume() {
        System.out.println("Louder");
    }

    @Override
    public void downVolume() {
        System.out.println("Quieter");
    }

    @Override
    public void mute() {
        System.out.println("On mute");
    }
}
