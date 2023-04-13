public class TV implements Device {

    private Boolean enabled = false;
    private int volume = 0;
    private int channel = 0;

    public TV(Boolean enabled, int volume, int channel) {
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
        System.out.println("TV is " + (isEnabled() ? "enabled" : "disabled"));
        System.out.println("TV volume is " + getVolume());
        System.out.println("TV channel is " + getChannel());
        System.out.println("----------------------------------------------------");
    }    
}
