package Util;

import java.io.Serializable;


public class ServerResponse<T> implements Serializable {
    private int errorcode;
    private  String msg;
    private  T data;

    public int getErrorcode() {

        return errorcode;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public ServerResponse() {
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    private ServerResponse(int errorcode, String msg){
        this.errorcode = errorcode;
        this.msg = msg;

    }
    //失败时返回的信息
    public static ServerResponse createError(int errorcode, String msg){

        return new ServerResponse(errorcode,msg);
    }
    private ServerResponse( String msg, T data){
        this.msg = msg;
        this.data = data;

    }
    //成功时返回的信息
    public static  <T> ServerResponse createSuccess(String msg, T data){

        return  new ServerResponse(msg,data);

    }
}
