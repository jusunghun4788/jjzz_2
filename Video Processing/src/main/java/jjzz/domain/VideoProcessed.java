package jjzz.domain;

import jjzz.domain.*;
import jjzz.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long field;
    private String url;

    public VideoProcessed(Video aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
