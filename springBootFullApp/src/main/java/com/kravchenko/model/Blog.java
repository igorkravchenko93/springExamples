package com.kravchenko.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Blog {

    @Id
    @Column(name = "blog_id")
    private Long id;

    @Column(name = "blog_name")
    private String blogName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "blog")
    private Set<BlogPost> posts;
}
