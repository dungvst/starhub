package com.starhub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author DungNV
 *
 */
@Entity
@Table(name = "user", catalog = "starhub", uniqueConstraints = @UniqueConstraint(columnNames = "user_code"))
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String userCode;
    private String password;
    private String userName;
    private String userEmail;
    private String roleId;
    private String status;

    public User() {
    }

    public User(int id, String userCode) {
        this.id = id;
        this.userCode = userCode;
    }

    public User(int id, String userCode, String password, String userName, String userEmail, String roleId, String status) {
        this.id = id;
        this.userCode = userCode;
        this.password = password;
        this.userName = userName;
        this.userEmail = userEmail;
        this.roleId = roleId;
        this.status = status;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "user_code", unique = true, nullable = false, length = 50)
    public String getUserCode() {
        return this.userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Column(name = "password", length = 200)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "user_name", length = 200)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_email", length = 200)
    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Column(name = "role_id", length = 10)
    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Column(name = "status", length = 5)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
