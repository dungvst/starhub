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
@Table(name = "header_section", catalog = "starhub")
public class HeaderSection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String mobileLink;
    private String broadbandLink;
    private String tvLink;
    private String homehubLink;
    private String status;

    public HeaderSection() {
    }

    public HeaderSection(String mobileLink, String broadbandLink, String tvLink, String homehubLink, String status) {
        this.mobileLink = mobileLink;
        this.broadbandLink = broadbandLink;
        this.tvLink = tvLink;
        this.homehubLink = homehubLink;
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

    @Column(name = "mobile_link", length = 200)
    public String getMobileLink() {
        return this.mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @Column(name = "broadband_link", length = 200)
    public String getBroadbandLink() {
        return this.broadbandLink;
    }

    public void setBroadbandLink(String broadbandLink) {
        this.broadbandLink = broadbandLink;
    }

    @Column(name = "tv_link", length = 200)
    public String getTvLink() {
        return this.tvLink;
    }

    public void setTvLink(String tvLink) {
        this.tvLink = tvLink;
    }

    @Column(name = "homehub_link", length = 200)
    public String getHomehubLink() {
        return this.homehubLink;
    }

    public void setHomehubLink(String homehubLink) {
        this.homehubLink = homehubLink;
    }

    @Column(name = "status", length = 5)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
