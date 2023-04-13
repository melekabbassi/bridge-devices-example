public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public int volumeDown() {
        int volume = device.getVolume();
        device.setVolume(--volume);
        return volume;
    }

    public int volumeUp() {
        int volume = device.getVolume();
        device.setVolume(++volume);
        return volume;
    }

    public int channelDown() {
        int channel = device.getChannel();
        device.setChannel(--channel);
        return channel;
    }

    public int channelUp() {
        int channel = device.getChannel();
        device.setChannel(++channel);
        return channel;
    }
}
