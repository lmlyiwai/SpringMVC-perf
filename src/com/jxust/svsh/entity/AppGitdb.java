package com.jxust.svsh.entity;

import javax.persistence.*;

/**
 * Created by mengleil on 4/6/2017.
 */
@Entity
@Table(name = "app_gitdb", schema = "lmldb", catalog = "")
public class AppGitdb {
    private String commit;
    private String author;
    private String comdate;
    private String sign;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppGitdb appGitdb = (AppGitdb) o;

        if (commit != null ? !commit.equals(appGitdb.commit) : appGitdb.commit != null) return false;
        if (author != null ? !author.equals(appGitdb.author) : appGitdb.author != null) return false;
        if (comdate != null ? !comdate.equals(appGitdb.comdate) : appGitdb.comdate != null) return false;
        if (sign != null ? !sign.equals(appGitdb.sign) : appGitdb.sign != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commit != null ? commit.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (comdate != null ? comdate.hashCode() : 0);
        result = 31 * result + (sign != null ? sign.hashCode() : 0);
        return result;
    }
}
