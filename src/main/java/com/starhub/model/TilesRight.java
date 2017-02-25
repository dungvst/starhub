package com.starhub.model;
// Generated Feb 25, 2017 11:11:29 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TilesRight generated by hbm2java
 */
@Entity
@Table(name = "tiles_right", catalog = "starhub")
public class TilesRight implements java.io.Serializable {

    private Integer id;
    private String imageId;
    private String title;
    private String subtitle;
    private String cta;
    private String status;

    public TilesRight() {
    }

    public TilesRight(String imageId, String title, String subtitle, String cta, String status) {
        this.imageId = imageId;
        this.title = title;
        this.subtitle = subtitle;
        this.cta = cta;
        this.status = status;
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

    @Column(name = "cta", length = 100)
    public String getCta() {
        return this.cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    @Column(name = "status", length = 5)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}