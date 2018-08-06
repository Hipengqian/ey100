package Util;

import java.io.Serializable;


public class ServerResponse<T> implements Serializable {
    private int errorcode;
    private  int  rightcode;
    private  T data;

    private String msg;

    public int getRightcode() {
        return rightcode;
    }

    public void setRightcode(int rightcode) {
        this.rightcode = rightcode;
    }

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
    private ServerResponse( int rightcode, T data){
        this.rightcode = rightcode;
        this.data = data;

    }
    //成功时返回的信息
    public static  <T> ServerResponse createSuccess(int rightcode, T data){

        return  new ServerResponse(rightcode,data);

    }
}
