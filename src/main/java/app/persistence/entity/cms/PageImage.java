package app.persistence.entity.cms;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Samuel Butta
 */

@Entity
@Data
public class PageImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Page page;

    @Column
    private String name;

    @Column
    private String path;
}
