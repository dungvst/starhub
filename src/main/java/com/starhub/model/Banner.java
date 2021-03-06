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
@Table(name = "banner", catalog = "starhub")
public class Banner implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;
    private String description;
    private String ctaText;
    private String ctaLink;
    private String imagePath;
    private String status;

    public Banner() {
    }

    public Banner(String title, String description, String ctaText, String ctaLink, String imagePath, String status) {
        this.title = title;
        this.description = description;
        this.ctaText = ctaText;
        this.ctaLink = ctaLink;
        this.imagePath = imagePath;
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

    @Column(name = "title", length = 200)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "cta_text", length = 50)
    public String getCtaText() {
        return this.ctaText;
    }

    public void setCtaText(String ctaText) {
        this.ctaText = ctaText;
    }

    @Column(name = "cta_link", length = 200)
    public String getCtaLink() {
        return this.ctaLink;
    }

    public void setCtaLink(String ctaLink) {
        this.ctaLink = ctaLink;
    }

    @Column(name = "image_path", length = 200)
    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Column(name = "status", length = 5)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
