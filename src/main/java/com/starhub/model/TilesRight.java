package com.starhub.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author DungNV
 *
 */
@Entity
@Table(name = "tiles_right", catalog = "starhub")
public class TilesRight implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String imagePath;
    private String title;
    private String subtitle;
    private String cta;
    private String status;

    public TilesRight() {
    }

    public TilesRight(String imagePath, String title, String subtitle, String cta, String status) {
        this.imagePath = imagePath;
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

    @Column(name = "image_path", length = 200)
    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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
