package com.kodat.of.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia=recent_change")
@Getter
@Setter
public class Wikimedia {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Lob
    private String eventData;

}
