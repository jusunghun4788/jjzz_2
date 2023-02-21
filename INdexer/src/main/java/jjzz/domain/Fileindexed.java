package jjzz.domain;

import jjzz.domain.*;
import jjzz.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Fileindexed extends AbstractEvent {

    private Long id;
    private List<String> keyword;
    private Long field;

    public Fileindexed(Index aggregate){
        super(aggregate);
    }
    public Fileindexed(){
        super();
    }
}
