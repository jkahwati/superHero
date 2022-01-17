package com.in2.superHero.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperHero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(unique=true)
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "powerStatsId", referencedColumnName = "id")
    private PowerStats powerStats;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "biographyId", referencedColumnName = "id")
    private Biography biography;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appearanceId", referencedColumnName = "id")
    private Appearance appearance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imageId", referencedColumnName = "id")
    private Image image;

}