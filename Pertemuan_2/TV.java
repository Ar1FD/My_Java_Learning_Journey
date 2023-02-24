class TV {
    int channel;
    int volumeLevel;
    Boolean on;

    public TV()
    {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public TV(int newChannel, int newVolumelevel, Boolean o)
    {
        channel = newChannel;
        volumeLevel = newVolumelevel;
        on = o;
    }

    public void turnOn()
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }

    public void setChannel(int newChannel)
    {
        if(newChannel > 0 && newChannel < 121){
            channel = newChannel;
        }

        else
            throw new IllegalArgumentException("Volume harus diantara 1 - 7");
    }
    
    public void setVolume(int newVolumelevel)
    {
        if(newVolumelevel > 0 && newVolumelevel < 8){
            volumeLevel = newVolumelevel;
        }

        else
            throw new IllegalArgumentException("Volume harus diantara 1 - 7");
    }

    public void channelUp()
    {
        if(channel > 0 && channel < 121){
            channel++;
        }

        else
            throw new IllegalArgumentException("Channel haru di antara  1 - 120");
    }
    public void channelDown()
    {
        if(channel > 0 && channel < 121){
            channel--;
        }

        else
            System.out.println("Channel harus di antara 1 - 120");
            
    }

    public void volumeUp()
    {
        if(volumeLevel > 0 && volumeLevel < 8){
            volumeLevel++;
        }

        else
            throw new IllegalArgumentException("Volume harus diantara 1 - 7");
    }
    public void volumeDown()
    {
        if(volumeLevel > 0 && volumeLevel < 8){
            volumeLevel--;
        }

        else
            throw new IllegalArgumentException("Volume harus diantara 1 - 7");
            
    }





    




}