package com.kravchenko.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Igor on 20.09.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Getter
@Setter
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "blog_post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Blog blog;

    @Column(name = "author")
    private String author;
    @Column(name = "post_text")
    private String postText;

}
