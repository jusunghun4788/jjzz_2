package jjzz.domain;

import jjzz.domain.*;
import jjzz.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createtime;
    private String type;
    private String userid;
}


