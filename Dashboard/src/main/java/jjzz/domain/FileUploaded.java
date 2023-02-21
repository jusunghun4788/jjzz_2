package jjzz.domain;

import jjzz.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date Createtime;
    private String type;
    private String userid;
}
