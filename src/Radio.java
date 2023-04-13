public class Radio implements Device {

    private Boolean enabled = false;
    private int volume = 0;
    private int channel = 0;

    public Radio(Boolean enabled, int volume, int channel) {
        this.enabled = enabled;
        this.volume = volume;
        this.channel = channel;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public Boolean isEnabled() {
        return getEnabled();
    }

    @Override
    public void enable() {
        setEnabled(true);
    }

    @Override
    public void disable() {
        setEnabled(false);
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void getStatus() {
        System.out.println("----------------------------------------------------");
        System.out.println("Radio is " + (isEnabled() ? "enabled" : "disabled"));
        System.out.println("Radio volume is " + getVolume());
        System.out.println("Radio channel is " + getChannel());
        System.out.println("----------------------------------------------------");
    }
}
