package com.nikhil.hindistatusalltime;

public class Status {
    private String id;

    private String hinStatus;
    private String engStatus;
    private String tags;
    private int shareCount;
    private int downloadCount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status(String id, String hinStatus, String engStatus, String tags, int shareCount, int downloadCount) {
        this.id = id;
        this.hinStatus = hinStatus;
        this.engStatus = engStatus;
        this.tags = tags;
        this.shareCount = shareCount;
        this.downloadCount = downloadCount;
    }

    public String getHinStatus() {
        return hinStatus;
    }

    public void setHinStatus(String hinStatus) {
        this.hinStatus = hinStatus;
    }

    public String getEngStatus() {
        return engStatus;
    }

    public void setEngStatus(String engStatus) {
        this.engStatus = engStatus;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }
}
