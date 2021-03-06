package com.jxust.svsh.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by mengleil on 4/6/2017.
 */
@Entity
@Table(name = "app_gitdb", schema = "javadb", catalog = "")
public class AppGitdb {
    private String commit;
    private String author;
    private String comdate;
    private String sign;
    private String gitlog;
    private java.sql.Date mydate;

    @Id
    @Column(name = "commit", nullable = false, length = 255)
    @GeneratedValue
    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 255)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "comdate", nullable = false, length = 255)
    public String getComdate() {
        return comdate;
    }

    public void setComdate(String comdate) {
        this.comdate = comdate;
    }

    @Basic
    @Column(name = "sign", nullable = false, length = 255)
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Basic
    @Column(name = "gitlog", nullable = true, length = 512)
    public String getGitlog() {
        return gitlog;
    }

    public void setGitlog(String gitlog) {
        this.gitlog = gitlog;
    }

    @Basic
    @Column(name = "mydate", nullable = true, precision = 0)
    public java.sql.Date getMydate() {
        return mydate;
    }

    public void setMydate(java.sql.Date mydate) {
        this.mydate = mydate;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        AppGitdb appGitdb = (AppGitdb) o;
//
//        if (commit != null ? !commit.equals(appGitdb.commit) : appGitdb.commit != null) return false;
//        if (author != null ? !author.equals(appGitdb.author) : appGitdb.author != null) return false;
//        if (comdate != null ? !comdate.equals(appGitdb.comdate) : appGitdb.comdate != null) return false;
//        if (sign != null ? !sign.equals(appGitdb.sign) : appGitdb.sign != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = commit != null ? commit.hashCode() : 0;
//        result = 31 * result + (author != null ? author.hashCode() : 0);
//        result = 31 * result + (comdate != null ? comdate.hashCode() : 0);
//        result = 31 * result + (sign != null ? sign.hashCode() : 0);
//        return result;
//    }
}
