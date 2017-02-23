package com.starhub.model;
// Generated Feb 23, 2017 11:20:31 AM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TilesLeft generated by hbm2java
 */
@Entity
@Table(name = "tiles_left", catalog = "starhub")
public class TilesLeft implements java.io.Serializable {

    private Integer id;
    private String imageId;
    private String title;
    private String subtitle;
    private String subtitle2;
    private String subtitle3;
    private String description;
    private String cta;

    public TilesLeft() {
    }

    public TilesLeft(String imageId, String title, String subtitle, String subtitle2, String subtitle3, String description, String cta) {
        this.imageId = imageId;
        this.title = title;
        this.subtitle = subtitle;
        this.subtitle2 = subtitle2;
        this.subtitle3 = subtitle3;
        this.description = description;
        this.cta = cta;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "image_id", length = 10)
    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Column(name = "title", length = 100)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "subtitle", length = 100)
    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Column(name = "subtitle_2", length = 100)
    public String getSubtitle2() {
        return this.subtitle2;
    }

    public void setSubtitle2(String subtitle2) {
        this.subtitle2 = subtitle2;
    }

    @Column(name = "subtitle_3", length = 100)
    public String getSubtitle3() {
        return this.subtitle3;
    }

    public void setSubtitle3(String subtitle3) {
        this.subtitle3 = subtitle3;
    }

    @Column(name = "description", length = 200)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "cta", length = 100)
    public String getCta() {
        return this.cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

}
