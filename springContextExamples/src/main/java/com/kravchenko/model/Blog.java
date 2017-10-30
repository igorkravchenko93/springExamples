package com.kravchenko.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Blog")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@ToString
public class Blog {

    @Id
    @Column(name = "blog_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Column(name = "blog_name")
    private String blogName;

}
