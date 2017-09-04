package io.github.haohaozaici.greendaoupdate.model.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by haohao on 2017/9/1.
 */

@Entity
public class Sample {

  @Id(autoincrement = true)
  Long id;

  @NotNull
  private String date;      //结算时间
  @NotNull
  private String user_id;   //结算用户
  @NotNull
  private String batch_no;  //结算批次号

  @NotNull
  private String details;   //结算信息  json

  private String test1;   //增加字段1
  private String test2;   //增加字段2

  @Generated(hash = 1501933952)
public Sample(Long id, @NotNull String date, @NotNull String user_id,
        @NotNull String batch_no, @NotNull String details, String test1,
        String test2) {
    this.id = id;
    this.date = date;
    this.user_id = user_id;
    this.batch_no = batch_no;
    this.details = details;
    this.test1 = test1;
    this.test2 = test2;
}

@Generated(hash = 976859954)
  public Sample() {
  }

  public Long getId() {
      return this.id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getDate() {
      return this.date;
  }

  public void setDate(String date) {
      this.date = date;
  }

  public String getUser_id() {
      return this.user_id;
  }

  public void setUser_id(String user_id) {
      this.user_id = user_id;
  }

  public String getBatch_no() {
      return this.batch_no;
  }

  public void setBatch_no(String batch_no) {
      this.batch_no = batch_no;
  }

  public String getDetails() {
      return this.details;
  }

  public void setDetails(String details) {
      this.details = details;
  }

public String getTest1() {
    return this.test1;
}

public void setTest1(String test1) {
    this.test1 = test1;
}

public String getTest2() {
    return this.test2;
}

public void setTest2(String test2) {
    this.test2 = test2;
}


  

}
