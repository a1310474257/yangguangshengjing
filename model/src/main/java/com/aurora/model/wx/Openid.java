package com.aurora.model.wx;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Openid {
   private String openid;
   private String session_key;
   private String unionid;
   private String errcode;
   private String errmsg;

   public Openid(String openid){
      this.openid = openid;
   }
}
