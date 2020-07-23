public class RemoteController implements Volume, Device{
    TVDevice tvDevice;

    void connectDevice(TVDevice device) {
        this.tvDevice = device;
    }

    void disconnectDevice() {
        this.tvDevice = null;
    }

    @Override
    public void powerOn() {
        this.tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        this.tvDevice.powerOn();

    }

    @Override
    public void setChannel(int channel) {
        this.tvDevice.setChannel(7);
    }

    @Override
    public void currentChannel() {
        this.tvDevice.currentChannel();
    }

    @Override
    public void upVolume() {
        this.tvDevice.upVolume();
    }

    @Override
    public void downVolume() {
        this.tvDevice.downVolume();
    }

    @Override
    public void mute() {
        this.tvDevice.mute();
    }
}
