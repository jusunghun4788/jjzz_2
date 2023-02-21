package jjzz.domain;

import jjzz.domain.Fileindexed;
import jjzz.INdexerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Index_table")
@Data

public class Index  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    @ElementCollection
    
    private List<String> keyword;
    
    
    
    
    
    private Long field;

    @PostPersist
    public void onPostPersist(){


        Fileindexed fileindexed = new Fileindexed(this);
        fileindexed.publishAfterCommit();

    }

    public static IndexRepository repository(){
        IndexRepository indexRepository = INdexerApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }




    public static void makeIndex(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

        
    }


}
