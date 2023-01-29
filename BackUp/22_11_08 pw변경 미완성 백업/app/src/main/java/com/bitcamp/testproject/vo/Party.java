package com.bitcamp.testproject.vo;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Party {

  private int no;
  private Region region;
  private Sports sports;
  private String title;
  private String content;
  private Date createdDate;
  private int headCount;
  private Time partyTime;
  private Date partyDate;

  private Member user;
  private int userNo;

  private double star;

  private int regionNo;
  private int sportsNo;

  private String thumbnail;

  private List<AttachedFile> attachedFiles;

  @Override
  public String toString() {
    return "Party [no=" + no + ", region=" + region + ", sports=" + sports + ", title=" + title
        + ", content=" + content + ", createdDate=" + createdDate + ", headCount=" + headCount
        + ", partyTime=" + partyTime + ", partyDate=" + partyDate + ", user=" + user + ", userNo="
        + userNo + ", star=" + star + ", regionNo=" + regionNo + ", sportsNo=" + sportsNo
        + ", thumbnail=" + thumbnail + ", attachedFiles=" + attachedFiles + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public Sports getSports() {
    return sports;
  }

  public void setSports(Sports sports) {
    this.sports = sports;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public int getHeadCount() {
    return headCount;
  }

  public void setHeadCount(int headCount) {
    this.headCount = headCount;
  }

  public Time getPartyTime() {
    return partyTime;
  }

  public void setPartyTime(Time partyTime) {
    this.partyTime = partyTime;
  }

  public Date getPartyDate() {
    return partyDate;
  }

  public void setPartyDate(Date partyDate) {
    this.partyDate = partyDate;
  }

  public Member getUser() {
    return user;
  }

  public void setUser(Member user) {
    this.user = user;
  }

  public int getUserNo() {
    return userNo;
  }

  public void setUserNo(int userNo) {
    this.userNo = userNo;
  }

  public double getStar() {
    return star;
  }

  public void setStar(double star) {
    this.star = star;
  }

  public int getRegionNo() {
    return regionNo;
  }

  public void setRegionNo(int regionNo) {
    this.regionNo = regionNo;
  }

  public int getSportsNo() {
    return sportsNo;
  }

  public void setSportsNo(int sportsNo) {
    this.sportsNo = sportsNo;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public List<AttachedFile> getAttachedFiles() {
    return attachedFiles;
  }

  public void setAttachedFiles(List<AttachedFile> attachedFiles) {
    this.attachedFiles = attachedFiles;
  }

}
