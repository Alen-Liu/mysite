package com.alen.site.modules.user.entiy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_users", schema = "mysite", catalog = "")
public class TUsersEntity {
    private int uid;
    private String username;
    private String password;
    private String email;
    private String homeUrl;
    private String screenName;
    private Integer created;
    private Integer activated;
    private Integer logged;
    private String groupName;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "homeUrl")
    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    @Basic
    @Column(name = "screenName")
    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Basic
    @Column(name = "created")
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    @Basic
    @Column(name = "activated")
    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    @Basic
    @Column(name = "logged")
    public Integer getLogged() {
        return logged;
    }

    public void setLogged(Integer logged) {
        this.logged = logged;
    }

    @Basic
    @Column(name = "groupName")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUsersEntity that = (TUsersEntity) o;
        return uid == that.uid &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email) &&
                Objects.equals(homeUrl, that.homeUrl) &&
                Objects.equals(screenName, that.screenName) &&
                Objects.equals(created, that.created) &&
                Objects.equals(activated, that.activated) &&
                Objects.equals(logged, that.logged) &&
                Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, email, homeUrl, screenName, created, activated, logged, groupName);
    }
}
