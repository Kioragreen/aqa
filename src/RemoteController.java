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

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void currentChannel() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }
}
