package com.kravchenko.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Igor on 20.09.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@EqualsAndHashCode(exclude = "blog")
@Getter
@Setter
@ToString(exclude = {"blog", "id"})
@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "blog_post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    @NonNull
    private Blog blog;

    @Column(name = "author")
    @NonNull
    private String author;

    @Column(name = "post_text")
    @NonNull
    private String postText;

}
