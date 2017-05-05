package com.jxust.svsh.entity;

import javax.persistence.*;
/**
 * Created by mengleil on 4/6/2017.
 */
@Entity
@Table(name = "app_thrputdb", schema = "lmldb", catalog = "")
public class AppThrputdb {
    private int id;
    private Double mer64;
    private Double mer128;
    private Double mer256;
    private Double nor64;
    private Double nor128;
    private Double nor256;
    private Double vec64;
    private Double vec128;
    private Double vec256;
    private java.sql.Date mydate;
    private String commitId;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mer64", nullable = false, length = 255)
    public Double getMer64() {
        return mer64;
    }

    public void setMer64(Double mer64) {
        this.mer64 = mer64;
    }

    @Basic
    @Column(name = "mer128", nullable = false, length = 255)
    public Double getMer128() {
        return mer128;
    }

    public void setMer128(Double mer128) {
        this.mer128 = mer128;
    }

    @Basic
    @Column(name = "mer256", nullable = false, length = 255)
    public Double getMer256() {
        return mer256;
    }

    public void setMer256(Double mer256) {
        this.mer256 = mer256;
    }

    @Basic
    @Column(name = "nor64", nullable = false, length = 255)
    public Double getNor64() {
        return nor64;
    }

    public void setNor64(Double nor64) {
        this.nor64 = nor64;
    }

    @Basic
    @Column(name = "nor128", nullable = false, length = 255)
    public Double getNor128() {
        return nor128;
    }

    public void setNor128(Double nor128) {
        this.nor128 = nor128;
    }

    @Basic
    @Column(name = "nor256", nullable = false, length = 255)
    public Double getNor256() {
        return nor256;
    }

    public void setNor256(Double nor256) {
        this.nor256 = nor256;
    }

    @Basic
    @Column(name = "vec64", nullable = false, length = 255)
    public Double getVec64() {
        return vec64;
    }

    public void setVec64(Double vec64) {
        this.vec64 = vec64;
    }

    @Basic
    @Column(name = "vec128", nullable = false, length = 255)
    public Double getVec128() {
        return vec128;
    }

    public void setVec128(Double vec128) {
        this.vec128 = vec128;
    }

    @Basic
    @Column(name = "vec256", nullable = false, length = 255)
    public Double getVec256() {
        return vec256;
    }

    public void setVec256(Double vec256) {
        this.vec256 = vec256;
    }

    @Basic
    @Column(name = "mydate", nullable = false, precision = 0)
    public java.sql.Date getMydate() {
        return mydate;
    }

    public void setMydate(java.sql.Date mydate) {
        this.mydate = mydate;
    }

    @Basic
    @Column(name = "commit_id", nullable = false, length = 255)
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

}
