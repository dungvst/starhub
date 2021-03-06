package com.starhub.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author DungNV
 *
 */
@Entity
@Table(name = "image", catalog = "starhub", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Image implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String path;
    private String type;
    private String status;

    public Image() {
    }

    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public Image(String name, String path, String type, String status) {
        this.name = name;
        this.path = path;
        this.type = type;
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

    @Column(name = "name", unique = true, nullable = false, length = 200)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "path", nullable = false, length = 200)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "type", length = 20)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "status", length = 5)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
