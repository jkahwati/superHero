package com.in2.superHero.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SuperHero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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