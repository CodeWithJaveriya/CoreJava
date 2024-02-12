package com.xworkz.youtube.youtube;

import com.xworkz.youtube.dto.ChannelsDTO;

import java.util.List;

public interface Youtube {

    public boolean addChannel(ChannelsDTO dto);

    public List<ChannelsDTO> getAllChannels();
}
