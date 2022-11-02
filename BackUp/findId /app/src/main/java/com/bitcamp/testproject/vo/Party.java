package com.bitcamp.testproject.vo;

import java.sql.Date;
import java.sql.Time;

public class Party {

  private int no;
  private Region region;
  private Sport sport;
  private String title;
  private String content;
  private Date createdDate;
  private int headCount;
  private Time partyTime;
  private Date partyDate;

  private Member user;

  private double star;

  @Override
  public String toString() {
    return "Party [no=" + no + ", region=" + region + ", sport=" + sport + ", title=" + title
        + ", content=" + content + ", createdDate=" + createdDate + ", headCount=" + headCount
        + ", partyTime=" + partyTime + ", partyDate=" + partyDate + ", user=" + user + ", star="
        + star + "]";
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

  public Sport getSport() {
    return sport;
  }

  public void setSport(Sport sport) {
    this.sport = sport;
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

  public double getStar() {
    return star;
  }

  public void setStar(double star) {
    this.star = star;
  }


}
