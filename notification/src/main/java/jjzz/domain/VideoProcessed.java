package jjzz.domain;

import jjzz.domain.*;
import jjzz.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long field;
    private String url;
}


