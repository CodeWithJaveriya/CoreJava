package com.xworkz.youtube.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class ChannelsDTO implements Serializable {

    private int id;
    private String channelName;
    private String channelEmail;
    private long phoneNumber;
    private int noOfSubscribers;
    private double earnings;
}
