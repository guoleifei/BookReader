package com.justwayward.reader.bean;

/**
 * Created by glf on 2017/3/2.
 */

public class BookUpdate {


    /**
     * _id : 53855a750ac0b3a41e00c7e6
     * author : 猫腻
     * referenceSource : sogou
     * updated : 2017-03-01T16:54:35.804Z
     * chaptersCount : 1123
     * lastChapter : 第1125章 如果你是除苏
     */

    private String _id;
    private String author;
    private String referenceSource;
    private String updated;
    private int chaptersCount;
    private String lastChapter;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReferenceSource() {
        return referenceSource;
    }

    public void setReferenceSource(String referenceSource) {
        this.referenceSource = referenceSource;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public int getChaptersCount() {
        return chaptersCount;
    }

    public void setChaptersCount(int chaptersCount) {
        this.chaptersCount = chaptersCount;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(String lastChapter) {
        this.lastChapter = lastChapter;
    }
}
