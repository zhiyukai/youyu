package com.youyu.utils;

public interface Contants {

  boolean DEBUG = true;

  interface Net {

    String BASE_URL = "https://paidan2018.cn/";
    String SEND_MSG = "buyer/regist/sendMsg";
    String SEND_RESET_MSG = "buyer/regist/sendRetsetMsg";
    String REGISTER = "buyer/regist/regist";
    String LOGIN = "buyer/login/login";
    String LOGOUT = "buyer/login/logout";
    String RESET_PASS = "buyer/regist/resetPwd";
    String PERSON_INFO = "buyer/person/info";
    String MODIFY_PASSWORD = "buyer/regist/modifyPassword";
    String SAVE_BANK = "buyer/bank/saveBank";
    String BUYER = "buyer";
    String SAVE_ACCOUNT = "buyer/account/saveAccount";
    String TASK_DETAIL = "buyer/task/detail";
    String TASK_MANAGER = "buyer/task/manager";
    String MONEY_BILLLIST = "buyer/money/billList";
    String TASK_CANCLETASK = "buyer/task/cancleTask";
    String TASK_CONTINUETASK = "buyer/task/continueTask";
    String TASK_SAVESTEP3 = "buyer/task/saveStep3";
    String TASK_CHECKSHOPNAME = "buyer/task/checkShopName";
    String MONEY_SAVEBUYERVERIFY = "buyer/money/saveBuyerVerify";
    String TASK_SAVESTEP4 = "buyer/task/saveStep4";
    String TASK_SAVESTEP5 = "buyer/task/saveStep5";
    String TASK_SAVESTEP7 = "buyer/task/saveStep7";
    String INV = "buyer/inv";
    String HELP = "buyer/help";
  }

  interface QiNiuKey {

    String AccessKey = "SGWgdjKSAL7Bufw-4OAccER14FM5JsY40INsQju6";//此处填你自己的AccessKey
    String SecretKey = "suzhiYBLtTmeH4bGzogs0rmabQ6MDuJ11h6VrXOT";//此处填你自己的SecretKey
    String PIC_UPLOAD_BASE_URL = "http://image.paidan2018.cn/";
  }

  interface NetStatus {

    String OK = "ok";
    String FAIL = "fail";
  }

  String TOKEN = "token";
  String PHONE = "phone";
  String PASS = "pass";
  String BUYER_ID = "buyerId";

  String BANK_CODE = "bank_code";
  String TAO_BAO_CODE = "tao_bao_code";
  String BIND_BANK_FLAG = "bind_bank_flag";
  String BIND_TAO_BAO_FLAG = "bind_tao_bao_flag";

  String DATA_TOTAL = "data_total";

  String TASK_ID = "taskId";

//  String ORDER_REMARK = "order_remark";

  String TASK_CAPTAIL = "task_captail";

//  String PRAISE_TYPE = "praise_type";
//  String PRAISE_TEXT = "praise_text";
//  String PRAISE_PICPATH1 = "praise_picpath1";
//  String PRAISE_PICPATH2 = "praise_picpath2";
//  String PRAISE_PICPATH3 = "praise_picpath3";

  int PER_PAGE_NUM = 10;

  String COMPARE_GOODS_PIC_FLAG = "compare_goods_pic_flag";
  String TI_XIAN_FLAG = "ti_xian_flag";

  int REQUEST_PERMISSION_CODE = 101;

  int COUNT_DOWN_60 = 60;
  int DELAY_TIME = 1000;
  int COUNT_DOWN_WHAT = 100;
  int COUNT_DOWN_END_WHAT = 101;


  int CONTINUE_TASK = 2;
  int CANCEL_TASK = 1;
  int NET_REQUEST_TASK = 3;

}